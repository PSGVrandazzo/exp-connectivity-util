/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.toppointofsaleclient.data;

import java.util.List;

public class TopTpidAndRegionResponse {
    private String hotelId;
    private List<TpidData> hopsTpidsList;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public List<TpidData> getHopsTpidsList() {
        return hopsTpidsList;
    }

    public void setHopsTpidsList(List<TpidData> hopsTpidsList) {
        this.hopsTpidsList = hopsTpidsList;
    }
}
