/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.sortranksclient.data;

import java.util.List;


public class SortRankSearchDate {
    private String searchDate;
    private List<SortRankTpid> tpids;

    public String getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(String searchDate) {
        this.searchDate = searchDate;
    }

    public List<SortRankTpid> getTpids() {
        return tpids;
    }

    public void setTpids(List<SortRankTpid> tpids) {
        this.tpids = tpids;
    }
}
