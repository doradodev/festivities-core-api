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
@Table(name = "RATING")
public class Rating {

    /*@Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;*/
    @Id
    @Column(name = "tconst")
    private String tconst;

    @Column(name = "averageRating")
    private String averageRating;

    @Column(name = "numVotes")
    private String numVotes; 
    
    
    
    @Builder
    public static Rating target(/*Long id,*/ String tconst, String averageRating, String numVotes) {
        
        Rating rating = new Rating();
        
        //rating.setId(id);
        rating.setTconst(tconst);
        rating.setAverageRating(averageRating);
        rating.setNumVotes(numVotes);
        
        return rating;
    }   
    
}
