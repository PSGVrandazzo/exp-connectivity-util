/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.competitorsetevents;

import com.expediapartnercentral.developer.competitorsetevents.data.AddCompSetResponse;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CompetitorSetEventsSample {

    // For HTTPS you may have to add the services.expediapartnercentral.com certificate to your keystore
    //
    // Instructions:
    // openssl s_client -connect services.expediapartnercentral.com:443 > services.expediapartnercentral.com.cer
    // sudo $JAVA_HOME/bin/keytool -import -trustcacerts -alias services.expediapartnercentral.com -file services.expediapartnercentral.com.cer -keystore $JAVA_HOME/jre/lib/security/cacerts
    // default java keystore password: changeit

    public static String addCompSetEndpoint = "https://services.expediapartnercentral.com/insights/public/v1/addCompSet";

    public static void main(String[] args){

        if(args.length != 3) {
            System.out.printf("missing required args: user pass hotelid");
            return;
        }

        String user = args[0];
        String password = args[1];
        int hotelId = Integer.parseInt(args[2]);

        Client client = ClientBuilder.newClient().register(JacksonFeature.class).register(new BasicAuthenticator(user, password));
        WebTarget target = client.target(addCompSetEndpoint);

        try {

            //
            //  Example: Get Add Competitor Set data as JSON string
            //

            String jsonString = target.queryParam("hotelId", hotelId)
                    .queryParam("startDate", "2014-01-01")
                    .queryParam("endDate", "2016-05-10")
                    .request(MediaType.APPLICATION_JSON)
                    .get(String.class);

            System.out.printf("Competitor set json string: %s\n", jsonString);

            //
            //  Example: Get Add Competitor Set data as POJO
            //

            AddCompSetResponse addCompSetResponse = target.queryParam("hotelId", hotelId)
                    .queryParam("startDate", "2014-01-01")
                    .queryParam("endDate", "2016-05-10")
                    .request(MediaType.APPLICATION_JSON)
                    .get(AddCompSetResponse.class);

            System.out.printf("Competitor set as object: status: %s\n", addCompSetResponse.getStatus());


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
