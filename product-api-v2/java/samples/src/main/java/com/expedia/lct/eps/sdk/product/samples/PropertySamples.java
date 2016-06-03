package com.expedia.lct.eps.sdk.product.samples;

import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.api.PropertyApi;
import com.expedia.lct.eps.sdk.product.model.PropertyDTO;

import java.util.List;

public class PropertySamples {

    public static final String PROPERTY_ID = "12933873";

    /*
     * Set credentials in API Client.
     */
    static {
        final ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setUsername("EQCtest12933873");
        apiClient.setPassword("cc47an46");
    }

    private void runSamples() throws Exception {
        System.out.println("*** getProperties ***\n");
        getProperties();

        System.out.println("*** getProperty ***\n");
        getProperty();
    }

    /*
     * Get all properties associated to this account.
     * Parameter are
     *  status - see PropertyDTO.StatusEnum for values.
     *  offset - Number of results to skip
     *  limit - Number of results to return
     *
     */
    public void getProperties() throws Exception {
        PropertyApi propertyApi = new PropertyApi();

        final List<PropertyDTO> properties =
            propertyApi.getProperties(null, null, null).getEntity();

        properties.forEach(this::displayProperty);
    }

    /*
     * Get a single Property. The only parameter is the property id.
     */
    public void getProperty() throws Exception {
        PropertyApi propertyApi = new PropertyApi();

        final PropertyDTO propertyDTO =
            propertyApi.getProperty(PROPERTY_ID).getEntity();

        displayProperty(propertyDTO);
    }

    private void displayProperty(PropertyDTO propertyDTO) {
        System.out.println("Property");
        System.out.println("  id: " + propertyDTO.getResourceId());
        System.out.println("  name: " + propertyDTO.getName());
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        PropertySamples propertySamples = new PropertySamples();
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
