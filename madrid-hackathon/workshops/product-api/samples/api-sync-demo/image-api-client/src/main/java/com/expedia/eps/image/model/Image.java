package com.expedia.eps.image.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {

    private String resourceId;
    private String publishedImageUrl;
    private ImageStatus status;
    private ImageState state;
    private String categoryCode;
    private Boolean propertyFeatured;
    private List<RoomType> roomTypes;
    private List<Comment> comments;
    private LocalDateTime lastUpdateDateTime;
    private String originalImageUrl;

}
