/**
 * 
 */
package com.prodigius.core.service.model.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.google.common.collect.Lists;
import com.prodigius.core.commons.exception.CommonRuntimeException;
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
	public Optional<Festivity> findByid(Long id) {
		checkNotNull(id, "The Festivity Id is a required argument!");

		try {

			return Optional.ofNullable(repository.findOne(id));
		} catch (Exception ex) {

			throw new CommonRuntimeException("Error finding Festivity by Id [" + id + "]!", ex);
		}

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
		checkNotNull(query, "The Festivity Query is a required argument!");
		try {

			QFestivity festivities = QFestivity.festivity;
			Predicate dateRange = null;
			Predicate endDate = null;
			Predicate startDate = null;

			if (query.getStart() != null && query.getEnd() == null) {

				startDate = addStartDate(festivities, query);
			}

			if (query.getStart() == null && query.getEnd() != null) {

				endDate = addEndDate(festivities, query);
			}

			if (query.getStart() != null && query.getEnd() != null) {

				dateRange = addDateRange(festivities, query);

			}

			Predicate place = addPlace(festivities, query);
			Predicate name = addName(festivities, query);

			Predicate finalQuery = ExpressionUtils.allOf(name, startDate, endDate, place, dateRange);

			return Lists.newArrayList(repository.findAll(finalQuery));

		} catch (Exception ex) {

			throw new CommonRuntimeException("Error getting Festivities by Query!", ex);

		}
	}

	private Predicate addDateRange(QFestivity festivities, Festivity query) {

		Predicate startDate = null;
		Predicate endDate = null;

		if (!query.getEnd().before(query.getStart())) {

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
