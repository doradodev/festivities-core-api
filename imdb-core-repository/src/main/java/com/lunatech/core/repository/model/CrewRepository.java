/**
 * 
 */
package com.lunatech.core.repository.model;

import com.lunatech.core.entity.model.imdb.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cristiandorado
 *
 */
public interface CrewRepository extends JpaRepository<Crew, Long>{
	
	List<Crew> findAll();

}
