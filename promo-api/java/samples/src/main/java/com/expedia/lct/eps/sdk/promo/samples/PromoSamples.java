package com.expedia.lct.eps.sdk.promo.samples;


import static java.util.Collections.singletonList;

import com.expedia.lct.eps.sdk.promo.ApiException;
import com.expedia.lct.eps.sdk.promo.api.PromoApi;
import com.expedia.lct.eps.sdk.promo.model.PromoType;
import com.expedia.lct.eps.sdk.promo.model.RatePlan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class PromoSamples {

    private static final String AUTH = "Basic RVFDdGVzdDEyOTMzODczOmNjNDdhbjQ2";
    private static final Integer HOTEL_ID = 12933873;
    private static final Integer PROMO_ID = 218535002;
    private static final String RATE_PLAN_ID = "206651852";

    private void runSamples() throws Exception {
        System.out.println("*** getAllPromotionsForHotel ***\n");
        getAllPromotionsForHotel();

        System.out.println("*** getPromoById ***\n");
        getPromoById();

        System.out.println("*** createPromo ***\n");
        createPromo();

        System.out.println("*** updatePromo ***\n");
        updatePromo();
    }

    public void getAllPromotionsForHotel() throws Exception {
        PromoApi promoApi = new PromoApi();

        final List<PromoType> promos =
            promoApi.getAllPromotionsForHotel(AUTH, HOTEL_ID, true, true).getEntity();

        promos.forEach(this::displayPromo);
    }

    public void getPromoById() throws Exception {
        PromoApi promoApi = new PromoApi();

        final List<PromoType> promos =
            promoApi.getPromoById(AUTH, HOTEL_ID, PROMO_ID, true, true).getEntity();

        promos.forEach(this::displayPromo);
    }

    public void createPromo() throws Exception {
        PromoApi promoApi = new PromoApi();

        final PromoType promo = new PromoType();
        RatePlan ratePlan = new RatePlan();
        ratePlan.setId(RATE_PLAN_ID);
        promo.setRatePlan(singletonList(ratePlan));
        promo.setName("MyPromo " + LocalDateTime.now().withNano(0).toString());
        promo.setTravelDateStart(LocalDate.now().plusWeeks(2).toString());
        promo.setTravelDateEnd(LocalDate.now().plusWeeks(4).toString());
        promo.setBookDateTimeStart(LocalDateTime.now().withNano(0).toString());
        promo.setBookDateTimeEnd(LocalDateTime.now().withNano(0).plusWeeks(2).toString());
        promo.setPercent(randomPercent());
        promo.setMinLOS(3);

        final PromoType newPromo = promoApi.createPromo(AUTH, promo, HOTEL_ID).getEntity().get(0);

        displayPromo(newPromo);
    }

    public void updatePromo() throws Exception {
        PromoApi promoApi = new PromoApi();

        final List<PromoType> promos =
            promoApi.getPromoById(AUTH, HOTEL_ID, PROMO_ID, false, false).getEntity();

        final PromoType promo = promos.get(0);

        System.out.println("Percent before update: " + promo.getPercent());

        promo.setPercent(randomPercent());

        final PromoType updatedPromo = promoApi.updatePromo(AUTH, promo, HOTEL_ID, PROMO_ID).getEntity().get(0);

        System.out.println("Percent after update: " + updatedPromo.getPercent());
    }

    private int randomPercent() {
        final int percent = (int) (Math.random() * 100);
        return percent >= 10 && percent <= 75 ? percent : randomPercent();
    }

    private void displayPromo(PromoType promoType) {
        System.out.println("Promo");
        System.out.println("  id: " + promoType.getId());
        System.out.println("  name: " + promoType.getName());
        System.out.println("  status: " + promoType.getStatus());
        System.out.println("  percent: " + promoType.getPercent());
        System.out.println("  travel start: " + promoType.getTravelDateStart());
        System.out.println("  travel end: " + promoType.getTravelDateEnd());
        System.out.println("  score: " + promoType.getScore());
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        PromoSamples propertySamples = new PromoSamples();
        try {
            propertySamples.runSamples();
        } catch (ApiException e) {
            System.err.println("Product Error!!!");
            System.err.println("Code " + e.getCode());
            System.err.println("Body " + e.getResponseBody());
            throw e;
        }
    }

}
