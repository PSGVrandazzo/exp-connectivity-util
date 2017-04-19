package com.expedia.eps.image.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {

    private Long resourceId;
    private Boolean roomTypeFeatured;

}
