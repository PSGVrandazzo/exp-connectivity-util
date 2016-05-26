/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.sortranksclient.data;

import java.util.List;

public class SortRankResponse {
    private int hotelId;
    private List<SortRankSearchDate> searchDates;
    private String error;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public List<SortRankSearchDate> getSearchDates() {
        return searchDates;
    }

    public void setSearchDates(List<SortRankSearchDate> searchDates) {
        this.searchDates = searchDates;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
