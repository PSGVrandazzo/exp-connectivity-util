/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.toppointofsaleclient.data;

import java.util.List;

public class TpidData {
    private int tpid;
    private List<Integer> sortedRegionList;

    public int getTpid() {
        return tpid;
    }

    public void setTpid(int tpid) {
        this.tpid = tpid;
    }

    public List<Integer> getSortedRegionList() {
        return sortedRegionList;
    }

    public void setSortedRegionList(List<Integer> sortedRegionList) {
        this.sortedRegionList = sortedRegionList;
    }
}
