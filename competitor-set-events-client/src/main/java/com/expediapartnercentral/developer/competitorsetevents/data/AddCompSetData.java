/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.competitorsetevents.data;

import java.util.List;

public class AddCompSetData {
    private int HotelId;
    private String HotelName;
    private String startDate;
    private String endDate;
    private List<Competitor> compSet;

    public int getHotelId() {
        return HotelId;
    }

    public void setHotelId(int hotelId) {
        HotelId = hotelId;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<Competitor> getCompSet() {
        return compSet;
    }

    public void setCompSet(List<Competitor> compSet) {
        this.compSet = compSet;
    }
}
