/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.sortranksclient.data;

import java.util.List;

public class SortRankTpid {
    private int tpid;
    private List<SortRankRegion> regions;

    public int getTpid() {
        return tpid;
    }

    public void setTpid(int tpid) {
        this.tpid = tpid;
    }

    public List<SortRankRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<SortRankRegion> regions) {
        this.regions = regions;
    }
}
