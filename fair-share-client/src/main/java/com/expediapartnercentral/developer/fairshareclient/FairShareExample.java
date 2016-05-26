/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.fairshareclient;

import com.expediapartnercentral.developer.fairshareclient.data.FairShareResponse;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class FairShareExample {

    // For HTTPS you may have to add the services.expediapartnercentral.com certificate to your keystore
    //
    // Instructions:
    // openssl s_client -connect services.expediapartnercentral.com:443 > services.expediapartnercentral.com.cer
    // sudo $JAVA_HOME/bin/keytool -import -trustcacerts -alias services.expediapartnercentral.com -file services.expediapartnercentral.com.cer -keystore $JAVA_HOME/jre/lib/security/cacerts
    // default java keystore password: changeit

    public static String fairShareEndpoint = "https://services.expediapartnercentral.com/insights/public/v1/fairShare";

    public static void main(String[] args){

        if(args.length != 3) {
            System.out.printf("missing required args: user pass hotelid");
            return;
        }

        String user = args[0];
        String password = args[1];
        int hotelId = Integer.parseInt(args[2]);

        Client client = ClientBuilder.newClient().register(JacksonFeature.class).register(new BasicAuthenticator(user, password));
        WebTarget target = client.target(fairShareEndpoint);

        try {

            //
            //  Example: Get Fair Share data as JSON string
            //

            String jsonString = target.queryParam("hotelId", hotelId)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);

            System.out.printf("Fair share json string: %s\n", jsonString);

            //
            //  Example: Get Fair Share data as POJO
            //

            FairShareResponse responseObject = target.queryParam("hotelId", hotelId)
                    .request(MediaType.APPLICATION_JSON)
                    .get(FairShareResponse.class);

            System.out.printf("Fair share object data: fair share: %f\n", responseObject.getData().getFairshare());

            //
            // Example: Get Fair Share data with specified number of days
            //

            FairShareResponse dayNumResponse = target.queryParam("hotelId", hotelId)
                    .queryParam("dayNum", 2)
                    .request(MediaType.APPLICATION_JSON)
                    .get(FairShareResponse.class);

            System.out.printf("Fair share object data: num days: %d\n", dayNumResponse.getData().getDaily().size());


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
