package com.expedia.eps.property.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyContent {

    private String locale;
    private String name;
    private String providerPropertyUrl;
    private List<Image> images;
    private List<Amenity> amenities;
    private List<Paragraph> paragraphs;

}

