/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.toppointofsaleclient;

import com.expediapartnercentral.developer.toppointofsaleclient.data.TopTpidAndRegionResponse;
import com.expediapartnercentral.developer.toppointofsaleclient.data.TpidMap;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class TopPointOfSaleExample {

    // For HTTPS you may have to add the services.expediapartnercentral.com certificate to your keystore
    //
    // Instructions:
    // openssl s_client -connect services.expediapartnercentral.com:443 > services.expediapartnercentral.com.cer
    // sudo $JAVA_HOME/bin/keytool -import -trustcacerts -alias services.expediapartnercentral.com -file services.expediapartnercentral.com.cer -keystore $JAVA_HOME/jre/lib/security/cacerts
    // default java keystore password: changeit

    private static String TopTpidEndpoint = "https://services.expediapartnercentral.com/top-tpids/lodgingSort/v1/hops/HopsTopTpidsAndRegions";

    public static void main(String[] args){

        if(args.length != 3) {
            System.out.printf("missing required args: user pass hotelid");
            return;
        }

        String user = args[0];
        String password = args[1];
        int hotelId = Integer.parseInt(args[2]);

        Client client = ClientBuilder.newClient().register(JacksonFeature.class).register(new BasicAuthenticator(user, password));
        WebTarget target = client.target(TopTpidEndpoint);

        try {

            //
            //  Example: Get Top TPID and Region Data as JSON string
            //

            String jsonString = target.queryParam("hotelId", hotelId)
                    .request(MediaType.APPLICATION_JSON)
                    .get(String.class);

            System.out.printf("Top POS data as Json String: %s\n", jsonString);

            //
            // Example: Get Top TPID and Region Data as POJO
            //

            TopTpidAndRegionResponse responseObject = target.queryParam("hotelId", hotelId)
                    .request(MediaType.APPLICATION_JSON)
                    .get(TopTpidAndRegionResponse.class);

            System.out.printf("hotel id: %s, Top Point of Sale:%s\n",
                    responseObject.getHotelId(),
                    TpidMap.getProviderName(responseObject.getHopsTpidsList().get(0).getTpid()));


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
