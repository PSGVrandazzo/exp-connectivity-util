/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.sortranksclient.data;

import java.util.List;

public class SortRankRegion {
    private int regionId;
    private List<SortRankData> data;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public List<SortRankData> getData() {
        return data;
    }

    public void setData(List<SortRankData> data) {
        this.data = data;
    }
}
