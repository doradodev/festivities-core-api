/**
 * 
 */
package com.prodigius.core.repository.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.prodigius.core.entity.model.festivitie.Festivity;

/**
 * @author cristiandorado
 *
 */
public interface FestivityRepository extends JpaRepository<Festivity, Long>, QueryDslPredicateExecutor<Festivity>{

}
