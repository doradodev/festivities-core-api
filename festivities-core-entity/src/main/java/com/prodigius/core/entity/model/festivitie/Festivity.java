/**
 * 
 */
package com.prodigius.core.entity.model.festivitie;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cristiandorado
 *
 */
@Getter
@Setter

public class Festivity {

	private Integer id;
	private String name;
	private String place;
	private Date start;
	private Date end;

	@Builder
	public static Festivity target(Integer id, String name, String place, Date start, Date end) {

		Festivity festivity = new Festivity();
		festivity.setId(id);
		festivity.setName(name);
		festivity.setPlace(place);
		festivity.setStart(start);
		festivity.setEnd(end);

		return festivity;
	}

}
