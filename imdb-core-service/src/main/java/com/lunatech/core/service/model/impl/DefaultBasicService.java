package com.lunatech.core.service.model.impl;

import com.lunatech.core.commons.exception.CommonRuntimeException;
import com.lunatech.core.repository.model.BasicRepository;
import com.lunatech.core.service.DTO.MoviesCharacter;
import com.lunatech.core.service.DTO.TitleRating;
import com.lunatech.core.service.model.BasicService;
import com.lunatech.core.service.util.QueryString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

@Service
public class DefaultBasicService implements BasicService {

    private final BasicRepository repository;    

    @Autowired
    private EntityManagerFactory emf;

    @Autowired
    public DefaultBasicService(BasicRepository repository) {
        this.repository = repository;
    }
    
    
    @Override
    public List<TitleRating> findTopRatingMoviesByGenre(String query) {
        checkNotNull(query, "The Basic query is a required argument!");

        try {
            
            List<TitleRating> titleRatings = new ArrayList<TitleRating>();                    
            List<Object[]> results = getData(query, QueryString.RATING_QUERY, "genre");
            
            for (Object[] result : results) {
                
                TitleRating titleRating = new TitleRating();
                titleRating.setPrimaryTitle((String) result[0]);
                titleRating.setAverageRating((String) result[1]);
                titleRatings.add(titleRating);
            }
            
            return titleRatings;

        } catch (Exception ex) {

            throw new CommonRuntimeException("Error getting Basic by QueryString!", ex);

        }        
    }

    @Override
    public List<MoviesCharacter> findMoviesByTitle(String title) {
        checkNotNull(title, "The Basic title is a required argument!");

        try {

            List<MoviesCharacter> movies = new ArrayList<MoviesCharacter>();
            List<Object[]> results = getData(title, QueryString.MOVIE_QUERY, "title");

            for (Object[] result : results) {

                MoviesCharacter movie = new MoviesCharacter();
                
                movie.setId((String) result[0]);
                movie.setPrimaryTitle((String) result[1]);                
                movie.setPrimaryName((String) result[2]);
                movie.setCharacters((String) result[3]);
                
                movies.add(movie);
            }

            return movies;    
        } catch (Exception ex) {

            throw new CommonRuntimeException("Error getting Basic by QueryString!", ex);

        }
        
    }
    
    @Transactional
    public List<Object[]> getData(String data, String query, String parameter){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Object[]> results = em.createQuery(query)
            .setParameter(parameter, data)
            .getResultList();        
        em.getTransaction().commit();
        em.close();
        return results;
    }
}
