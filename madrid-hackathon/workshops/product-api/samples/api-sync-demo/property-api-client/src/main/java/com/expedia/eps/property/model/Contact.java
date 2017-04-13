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
public class Contact {

    private String firstName;
    private String lastName;
    private List<String> emails;
    private List<PhoneNumber> phoneNumbers;

}

