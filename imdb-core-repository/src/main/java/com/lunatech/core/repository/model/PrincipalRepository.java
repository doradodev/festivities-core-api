/**
 * 
 */
package com.lunatech.core.repository.model;

import com.lunatech.core.entity.model.imdb.Principal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cristiandorado
 *
 */
public interface PrincipalRepository extends JpaRepository<Principal, Long>{
	
	List<Principal> findAll();

}
