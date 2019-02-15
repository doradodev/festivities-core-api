package com.lunatech.core.entity.model.imdb;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "BASIC")
public class Basic {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;    
        
    @Column(name = "tconst")
    private String tconst;

    @Column(name = "titleType")
    private String titleType;
    
    @Column(name = "primaryTitle")
    private String primaryTitle;
    
    @Column(name = "originalTitle")
    private String originalTitle;
    
    @Column(name = "isAdult")
    private String isAdult;
    
    @Column(name = "startYear")
    private String startYear;
    
    @Column(name = "endYear")
    private String endYear;
    
    @Column(name = "runtimeMinutes")
    private String runtimeMinutes;
    
    @Column(name = "genres")
    private String genres;    
    
    @Builder
    public static Basic target(Long id, String tconst, String titleType, String primaryTitle, String originalTitle, String isAdult, String startYear, String endYear, String runtimeMinutes, String genres) {
        
        Basic basic = new Basic();
        basic.setId(id);
        basic.setTconst(tconst);
        basic.setTitleType(titleType);
        basic.setPrimaryTitle(primaryTitle);
        basic.setOriginalTitle(originalTitle);
        basic.setIsAdult(isAdult);
        basic.setStartYear(startYear);
        basic.setEndYear(endYear);
        basic.setRuntimeMinutes(runtimeMinutes);
        basic.setGenres(genres);
        
        return basic;
    }
    
    
    
    
    
}
