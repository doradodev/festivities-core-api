package com.lunatech.core.service.model;

import com.lunatech.core.service.DTO.MoviesCharacter;
import com.lunatech.core.service.DTO.TitleRating;

import java.util.List;

public interface BasicService {
    
    List <TitleRating> findTopRatingMoviesByGenre(String genre);
    List <MoviesCharacter> findMoviesByTitle(String title);
}
