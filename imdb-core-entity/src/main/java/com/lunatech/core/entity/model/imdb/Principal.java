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
@Table(name = "PRINCIPAL")
public class Principal {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "tconst")
    private String tconst;

    @Column(name = "ordering")
    private String ordering;
    
    @Column(name = "nconst")
    private String nconst;
    
    @Column(name = "category")
    private String category;
    
    @Column(name = "job")
    private String job;
    
    @Column(name = "characteres")
    private String characteres;
    
    @Builder
    public static Principal target(Long id, String tconst, String ordering, String nconst, String category, String job, String characteres){
        
        Principal principal = new Principal();
        
        principal.setId(id);
        principal.setTconst(tconst);
        principal.setOrdering(ordering);
        principal.setNconst(nconst);
        principal.setCategory(category);
        principal.setJob(job);
        principal.setCharacteres(characteres);
        
        return principal;
    }
    
}
