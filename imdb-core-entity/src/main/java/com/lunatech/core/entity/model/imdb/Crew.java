package com.lunatech.core.entity.model.imdb;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author cristiandorado
 */

@Getter
@Setter
@Entity
@Table(name = "CREW")
public class Crew {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;
    
    @Column(name = "tconst")
    private String tconst;
    
    @Column(name = "directors")
    private String directors;
    
    @Column(name = "writers")
    private String writers;  
    
    @Builder
    public static Crew target(Long id, String tconst, String directors, String writers){
        
        Crew crew = new Crew();
        
        crew.setId(id);
        crew.setTconst(tconst);
        crew.setDirectors(directors);
        crew.setWriters(writers);
        
        return crew;
    }
    
    
    
    
}
