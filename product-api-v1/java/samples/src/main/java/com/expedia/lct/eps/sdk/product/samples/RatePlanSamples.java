package com.expedia.lct.eps.sdk.product.samples;

import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.api.RatePlanApi;
import com.expedia.lct.eps.sdk.product.model.DistributionRuleDTO;
import com.expedia.lct.eps.sdk.product.model.RatePlanDTO;

import java.util.List;

public class RatePlanSamples {

    private static final String AUTH = "Basic RVFDdGVzdDEyOTMzODczOmNjNDdhbjQ2";
    private static final Integer PROPERTY_ID = 12933873;
    private static final Integer ROOM_TYPE_ID = 201357991;
    private static final Integer RATE_PLAN_ID = 206651852;

    /*
     * Set credentials in API Client.
     */
    static {
        final ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setUsername("EQCtest12933873");
        apiClient.setPassword("cc47an46");
    }

    private void runSamples() throws Exception {
        System.out.println("*** getRatePlans ***\n");
        getRatePlans();

        System.out.println("*** getRatePlan ***\n");
        getRatePlan();

        System.out.println("*** createRatePlan ***\n");
        createRatePlan();

        System.out.println("*** updateRatePlan ***\n");
        updateRatePlan();

        System.out.println("*** deleteRatePlan ***\n");
        deleteRatePlan();
    }

    public void getRatePlans() throws Exception {
        RatePlanApi ratePlanApi = new RatePlanApi();

        final List<RatePlanDTO> ratePlans =
            ratePlanApi.getRatePlans(AUTH, PROPERTY_ID, ROOM_TYPE_ID, null).getEntity();

        ratePlans.forEach(this::displayRatePlan);
    }

    public void getRatePlan() throws Exception {
        RatePlanApi ratePlanApi = new RatePlanApi();

        final RatePlanDTO ratePlanDTO =
            ratePlanApi.getRatePlan(AUTH, PROPERTY_ID, ROOM_TYPE_ID, RATE_PLAN_ID).getEntity();

        displayRatePlan(ratePlanDTO);
    }

    public void createRatePlan() throws Exception {
        System.out.println("No sample");
        System.out.println();
    }

    public void updateRatePlan() throws Exception {
        RatePlanApi ratePlanApi = new RatePlanApi();

        final RatePlanDTO ratePlanDTO =
            ratePlanApi.getRatePlan(AUTH, PROPERTY_ID, ROOM_TYPE_ID, RATE_PLAN_ID).getEntity();

        System.out.println("Partner Code before update: "
                           + ratePlanDTO.getDistributionRules().get(0).getPartnerCode());

        ratePlanDTO.getDistributionRules().get(0).setPartnerCode("PC" + randomInt());
        ratePlanDTO.getDistributionRules().stream()
            .map(DistributionRuleDTO::getCompensation)
            .filter(c -> c.getExceptions().size() == 0)
            .forEach(c -> c.setExceptions(null));

        final RatePlanDTO updatedRatePlanDTO =
            ratePlanApi.updateRatePlan(AUTH, PROPERTY_ID, ROOM_TYPE_ID, RATE_PLAN_ID, ratePlanDTO).getEntity();

        System.out.println("Partner Code after Update: "
                           + updatedRatePlanDTO.getDistributionRules().get(0).getPartnerCode());

    }

    public void deleteRatePlan() throws Exception {
        System.out.println("No sample");
        System.out.println();
    }

    private void displayRatePlan(RatePlanDTO ratePlanDTO) {
        System.out.println("RatePlan");
        System.out.println("  id: " + ratePlanDTO.getResourceId());
        System.out.println("  name: " + ratePlanDTO.getName());
        System.out.println();
    }

    private int randomInt() {
        return (int) (Math.random() * 1000);
    }

    public static void main(String[] args) throws Exception {
        RatePlanSamples ratePlanSamples = new RatePlanSamples();
        try {
            ratePlanSamples.runSamples();
        } catch (ApiException e) {
            System.err.println("Product Error!!!");
            System.err.println("Code " + e.getCode());
            System.err.println("Body " + e.getResponseBody());
            throw e;
        }
    }

}
