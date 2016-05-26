/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.fairshareclient.data;

import java.util.List;

public class FairShareData {
    private int compSetRoomCount;
    private double fairshare;
    private int roomCount;
    private List<DailyShare> daily;

    public int getCompSetRoomCount() {
        return compSetRoomCount;
    }

    public void setCompSetRoomCount(int compSetRoomCount) {
        this.compSetRoomCount = compSetRoomCount;
    }

    public double getFairshare() {
        return fairshare;
    }

    public void setFairshare(double fairshare) {
        this.fairshare = fairshare;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public List<DailyShare> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyShare> daily) {
        this.daily = daily;
    }
}
