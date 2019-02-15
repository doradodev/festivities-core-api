/**
 * 
 */
package com.lunatech.core.repository.model;

import com.lunatech.core.entity.model.imdb.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cristiandorado
 *
 */
public interface RatingRepository extends JpaRepository<Rating, String>{
	
	List<Rating> findAll();

}
