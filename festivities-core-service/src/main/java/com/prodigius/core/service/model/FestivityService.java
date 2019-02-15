/**
 * 
 */
package com.prodigius.core.service.model;

import java.util.List;
import java.util.Optional;

import com.prodigius.core.entity.model.festivitie.Festivity;

/**
 * @author cristiandorado
 *
 */
public interface FestivityService {
	
	List<Festivity> findAll();
	
	Optional<Festivity> findByid(Long id);
	
	void save(Festivity festivity);
	 
	void update(Festivity festivity);
 
    void delete(Long id);
    
    List<Festivity> findByQuery(Festivity festivity);

}
