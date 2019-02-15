/**
 * 
 */
package com.lunatech.core.repository.model;

import com.lunatech.core.entity.model.imdb.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cristiandorado
 *
 */
public interface BasicRepository extends JpaRepository<Basic, Long>{
	
	List<Basic> findAll();

}
