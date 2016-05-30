package com.expedia.lct.eps.sdk.product.samples;

import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.api.RoomTypeApi;
import com.expedia.lct.eps.sdk.product.model.RoomTypeDTO;

import java.util.List;

public class RoomTypeSamples {

    public static final String PROPERTY_ID = "12933873";
    public static final String ROOM_TYPE_ID = "201357991";

    /*
     * Set credentials in API Client.
     */
    static {
        final ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setUsername("EQCtest12933873");
        apiClient.setPassword("cc47an46");
    }

    private void runSamples() throws Exception {
        System.out.println("*** getRoomTypes ***\n");
        getRoomTypes();

        System.out.println("*** getRoomType ***\n");
        getRoomType();

        System.out.println("*** createRoomType ***\n");
        createRoomType();

        System.out.println("*** updateRoomType ***\n");
        updateRoomType();
    }

    public void getRoomTypes() throws ApiException {
        RoomTypeApi roomTypeApi = new RoomTypeApi();

        final List<RoomTypeDTO> roomTypes =
            roomTypeApi.getRoomTypes(PROPERTY_ID, null).getEntity();

        roomTypes.stream().forEach(this::displayRoomType);
    }

    public void getRoomType() throws Exception {
        RoomTypeApi roomTypeApi = new RoomTypeApi();

        final RoomTypeDTO roomTypeDTO =
            roomTypeApi.getRoomType(PROPERTY_ID, ROOM_TYPE_ID).getEntity();

        displayRoomType(roomTypeDTO);
    }

    public void createRoomType() throws Exception {
        System.out.println("No sample");
        System.out.println();
    }

    public void updateRoomType() throws Exception {
        RoomTypeApi roomTypeApi = new RoomTypeApi();

        final RoomTypeDTO roomTypeDTO =
            roomTypeApi.getRoomType(PROPERTY_ID, ROOM_TYPE_ID).getEntity();

        System.out.println("Partner Code before update: " + roomTypeDTO.getPartnerCode());
        roomTypeDTO.setPartnerCode("PC" + randomInt());

        final RoomTypeDTO updatedRoomTypeDTO =
            roomTypeApi.updateRoomType(PROPERTY_ID, ROOM_TYPE_ID, roomTypeDTO).getEntity();

        System.out.println("Partner Code after update: " + updatedRoomTypeDTO.getPartnerCode());

    }

    private void displayRoomType(RoomTypeDTO roomTypeDTO) {
        System.out.println("RoomType");
        System.out.println("  id: " + roomTypeDTO.getResourceId());
        System.out.println("  name: " + roomTypeDTO.getName().getValue());
        System.out.println();
    }

    private int randomInt() {
        return (int) (Math.random() * 1000);
    }

    public static void main(String[] args) throws Exception {
        RoomTypeSamples roomTypeSamples = new RoomTypeSamples();
        try {
            roomTypeSamples.runSamples();
        } catch (ApiException e) {
            System.err.println("Product Error!!!");
            System.err.println("Code " + e.getCode());
            System.err.println("Body " + e.getResponseBody());
            throw e;
        }
    }

}
