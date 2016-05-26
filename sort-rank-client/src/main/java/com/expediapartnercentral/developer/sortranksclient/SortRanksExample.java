/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.sortranksclient;

import com.expediapartnercentral.developer.sortranksclient.data.SortRankResponse;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class SortRanksExample {

    // For HTTPS you may have to add the services.expediapartnercentral.com certificate to your keystore
    //
    // Instructions:
    // openssl s_client -connect services.expediapartnercentral.com:443 > services.expediapartnercentral.com.cer
    // sudo $JAVA_HOME/bin/keytool -import -trustcacerts -alias services.expediapartnercentral.com -file services.expediapartnercentral.com.cer -keystore $JAVA_HOME/jre/lib/security/cacerts
    // default java keystore password: changeit

    private static String SortRankEndpoint = "https://services.expediapartnercentral.com/sort-ranks/lodgingSort/v1/hops/HopsAverageRanks";

    public static void main(String[] args){

        if(args.length != 3) {
            System.out.printf("missing required args: user pass hotelid");
            return;
        }

        String user = args[0];
        String password = args[1];
        int hotelId = Integer.parseInt(args[2]);

        Client client = ClientBuilder.newClient().register(JacksonFeature.class).register(new BasicAuthenticator(user, password));
        WebTarget target = client.target(SortRankEndpoint);

        try {

            //
            //  Example: Get sort rank  as JSON string
            //

            String jsonString = target.queryParam("hotelId", hotelId)
                    .request(MediaType.APPLICATION_JSON)
                    .get(String.class);

            System.out.printf("String json data for hotel %d: %s\n", hotelId, jsonString);

            //
            //  Example: Get sort rank as POJO
            //

            SortRankResponse sortRankData = target.queryParam("hotelId", hotelId)
                    .request(MediaType.APPLICATION_JSON)
                    .get(SortRankResponse.class);

            System.out.printf("Sort Rank data hotel id: %d\n",sortRankData.getHotelId());

            //
            //  Example: Get sort rank specifying search date and num days
            //

            SortRankResponse dateSpecificSortRankData = target
                    .queryParam("hotelId", hotelId)
                    .queryParam("searchDate", "2016-05-23")
                    .queryParam("checkin", "2016-05-23")
                    .queryParam("numDays", 1)
                    .request(MediaType.APPLICATION_JSON)
                    .get(SortRankResponse.class);

            System.out.printf("Sort Rank date specific search data: Date: %s\n",
                    dateSpecificSortRankData.getSearchDates().get(0).getSearchDate());


            //
            //  Example: Error search date out of range
            //

            SortRankResponse errorSortRankData = target
                    .queryParam("hotelId", hotelId)
                    .queryParam("searchDate", "2026-06-17")
                    .queryParam("checkin", "2016-05-16")
                    .queryParam("numDays", 1)
                    .request(MediaType.APPLICATION_JSON)
                    .get(SortRankResponse.class);

            System.out.printf("Sort Rank error response: %s\n", errorSortRankData.getError());

        } catch (NotAuthorizedException ex){
            // throws when credentials are invalid
            System.out.printf(ex.getMessage());
            return;
        } catch (ForbiddenException ex){
            // throws when not authorized to access hotel id or hotel id is missing
            System.out.printf(ex.getMessage());
            return;
        }

    }
}
