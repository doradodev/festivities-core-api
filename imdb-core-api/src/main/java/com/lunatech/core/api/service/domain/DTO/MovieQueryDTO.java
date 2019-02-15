package com.lunatech.core.api.service.domain.DTO;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "movieQuery", description = "The movie QueryString Representation")
public class MovieQueryDTO implements Serializable {

    private String title;

    @Builder
    public static MovieQueryDTO target(String title) {

        MovieQueryDTO query = new MovieQueryDTO();

        query.setTitle(title);
        
        return query;
    }
}
