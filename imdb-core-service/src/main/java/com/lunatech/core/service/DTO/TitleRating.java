package com.lunatech.core.service.DTO;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TitleRating {
    
    private String primaryTitle;
    private String averageRating;
    
    @Builder
    public static TitleRating target(String primaryTitle, String averageRating){
        
        TitleRating titleRating = new TitleRating();
        
        titleRating.setAverageRating(averageRating);
        titleRating.setPrimaryTitle(primaryTitle);
        
        return titleRating;
    }
}
