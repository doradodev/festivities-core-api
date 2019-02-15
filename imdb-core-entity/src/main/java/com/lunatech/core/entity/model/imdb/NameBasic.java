package com.lunatech.core.entity.model.imdb;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "NAMEBASIC")
public class NameBasic {
    
    @Id
    @Column(name = "nconst")
    private String nconst;

    @Column(name = "primaryName")
    private String primaryName;

    @Column(name = "birthYear")
    private String birthYear;
    
    @Column(name = "deathYear")
    private String deathYear;
    
    @Column(name = "primaryProfession")
    private String primaryProfession;
    
    @Column(name = "knownForTitles")
    private String knownForTitles;
    
    @Builder
    public static NameBasic target(String nconst, String primaryName, String birthYear, String deathYear, String primaryProfession, String knownForTitles){
        
        NameBasic nameBasic = new NameBasic();
        
        nameBasic.setNconst(nconst);
        nameBasic.setPrimaryName(primaryName);
        nameBasic.setBirthYear(birthYear);
        nameBasic.setDeathYear(deathYear);
        nameBasic.setPrimaryProfession(primaryProfession);
        nameBasic.setKnownForTitles(knownForTitles);
        
        return nameBasic;
    }
    
}
