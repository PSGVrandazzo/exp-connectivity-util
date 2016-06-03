package com.expedia.feed.marketplace.client.example;

import com.expedia.feed.marketplace.client.ApiClient;
import com.expedia.feed.marketplace.client.EventsApi;
import com.expedia.feed.marketplace.client.MessagesApi;
import com.expedia.feed.marketplace.client.model.BatchEventReport;
import com.expedia.feed.marketplace.client.model.EventReport;
import com.expedia.feed.marketplace.client.model.FeedResponse;
import com.expedia.feed.marketplace.client.model.Message;

public class MarketplaceFeedExample {

    public static void main(String... args) throws Exception {

        if (args.length != 4) {
            System.err.println("Args: <username> <password> <hotelId> <clientId>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];
        String hotelId = args[2];
        String clientId = args[3];

        ApiClient client = new ApiClient();
        client.setUsername(username);
        client.setPassword(password);

        // get the messages for the specified hotel
        MessagesApi messagesApi = new MessagesApi(client);
        FeedResponse response = messagesApi.getFeed(hotelId, clientId);
        System.out.println("Messages for hotel " + hotelId + ":");
        System.out.println(response);

        if (!response.getMessages().isEmpty()) {
            System.out.println();
            // send a "viewed" analytics event for the first message
            Message firstMessage = response.getMessages().get(0);
            EventReport event = new EventReport();
            event.setMessageId(firstMessage.getId());
            event.setAction("viewed");
            BatchEventReport batchEventReport = new BatchEventReport();
            batchEventReport.getEvents().add(event);

            EventsApi eventsApi = new EventsApi(client);
            eventsApi.postEvents(clientId, batchEventReport);
            System.out.println("Sent 'viewed' event for message: " + firstMessage.getId());
        }
    }

}
