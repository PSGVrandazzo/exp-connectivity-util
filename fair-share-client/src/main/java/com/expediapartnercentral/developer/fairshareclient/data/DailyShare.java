/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.fairshareclient.data;


public class DailyShare {
    private int bookedRooms;
    private int compSetBookedRooms;
    private String date;

    public int getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(int bookedRooms) {
        this.bookedRooms = bookedRooms;
    }

    public int getCompSetBookedRooms() {
        return compSetBookedRooms;
    }

    public void setCompSetBookedRooms(int compSetBookedRooms) {
        this.compSetBookedRooms = compSetBookedRooms;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
