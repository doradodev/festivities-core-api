/**
 * 
 */
package com.prodigius.core.service.model.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.prodigius.core.entity.model.festivitie.Festivity;
import com.prodigius.core.service.model.FestivityService;

/**
 * @author cristiandorado
 *
 */
@Service
public class DefaultFestivityService implements FestivityService{

	@Override
	public Page<Festivity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Festivity> findByid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Festivity save(Festivity festivity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Festivity update(Festivity festivity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}
