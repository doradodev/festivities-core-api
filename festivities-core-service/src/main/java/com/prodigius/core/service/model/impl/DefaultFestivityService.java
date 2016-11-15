/**
 * 
 */
package com.prodigius.core.service.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.google.common.collect.Lists;
import com.prodigius.core.entity.model.festivitie.Festivity;
import com.prodigius.core.entity.model.festivitie.QFestivity;
import com.prodigius.core.repository.model.FestivityRepository;
import com.prodigius.core.service.model.FestivityService;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;

/**
 * @author cristiandorado
 *
 */
@Service
public class DefaultFestivityService implements FestivityService {

	private final FestivityRepository repository;

	@Autowired
	public DefaultFestivityService(FestivityRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Festivity> findAll() {

		return repository.findAll();
	}

	@Override
	public Festivity findByid(Long id) {

		return repository.findOne(id);
	}

	@Override
	public void save(Festivity festivity) {

		repository.save(festivity);
	}

	@Override
	public void update(Festivity festivity) {

		repository.save(festivity);
	}

	@Override
	public void delete(Long id) {

		repository.delete(id);

	}

	@Override
	public List<Festivity> findByQuery(Festivity query) {

		QFestivity festivities = QFestivity.festivity;
		Predicate dateRange = null;
		Predicate endDate = null;
		Predicate startDate = null;

		if (!query.getEnd().before(query.getStart())) {

			if (query.getStart() != null && query.getEnd() == null) {

				startDate = addStartDate(festivities, query);
			}

			if (query.getStart() == null && query.getEnd() != null) {

				endDate = addEndDate(festivities, query);
			}

			if (query.getStart() != null && query.getEnd() != null) {

				dateRange = addDateRange(festivities, query);

			}
		}

		Predicate place = addPlace(festivities, query);
		Predicate name = addName(festivities, query);

		Predicate finalQuery = ExpressionUtils.allOf(name, startDate, endDate, place, dateRange);

		return Lists.newArrayList(repository.findAll(finalQuery));
	}

	private Predicate addDateRange(QFestivity festivities, Festivity query) {

		Predicate startDate = null;
		Predicate endDate = null;

		if (query.getStart() != null && query.getEnd() != null) {

			startDate = festivities.start.goe(query.getStart());
			endDate = festivities.end.loe(query.getEnd());
			return ExpressionUtils.allOf(startDate, endDate);
		}
		return null;
	}

	private Predicate addPlace(QFestivity festivities, Festivity query) {

		if (!StringUtils.isEmpty(query.getPlace())) {
			return festivities.place.eq(query.getPlace());
		}
		return null;
	}

	private Predicate addEndDate(QFestivity festivities, Festivity query) {

		if (query.getEnd() != null) {
			return festivities.end.eq(query.getEnd());
		}

		return null;
	}

	private Predicate addStartDate(QFestivity festivities, Festivity query) {

		if (query.getStart() != null) {
			return festivities.start.eq(query.getStart());
		}
		return null;
	}

	private Predicate addName(QFestivity festivities, Festivity query) {

		if (!StringUtils.isEmpty(query.getName())) {

			return festivities.name.eq(query.getName());
		}

		return null;
	}

}
