package com.lunatech.core.api.service.domain.DTO;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "ratingQuery", description = "The rating QueryString Representation")
public class RatingQueryDTO implements Serializable {
    
    private String genre;    

    @Builder
    public static RatingQueryDTO target(String genre) {
        
        RatingQueryDTO query = new RatingQueryDTO();
        
        query.setGenre(genre);
        
        
        return query;        
    }
}
