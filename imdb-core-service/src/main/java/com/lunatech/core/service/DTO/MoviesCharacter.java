package com.lunatech.core.service.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoviesCharacter {

    private String id;
    private String primaryTitle;
    private String originalTitle; 
    private String primaryName; 
    private String characters;
    
    @Builder
    public static MoviesCharacter target (String id, String primaryTitle, String originalTitle, String primaryName, String characters){
        
        MoviesCharacter moviesCharacter = new MoviesCharacter();
        
        moviesCharacter.setId(id);
        moviesCharacter.setPrimaryName(primaryName);
        moviesCharacter.setPrimaryTitle(primaryTitle);
        moviesCharacter.setOriginalTitle(originalTitle);
        moviesCharacter.setCharacters(characters);
        
        return moviesCharacter;
    }

}
