/**
 * 
 */
package com.prodigius.core.service.model;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.prodigius.core.entity.model.festivitie.Festivity;

/**
 * @author cristiandorado
 *
 */
public interface FestivityService {
	
	Page<Festivity> findAll();
	
	Optional<Festivity> findByid();
	
	Festivity save(Festivity festivity);
	 
	Festivity update(Festivity festivity);
 
    void delete(Integer id);

}
