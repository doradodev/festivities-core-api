/**
 * 
 */
package com.prodigius.core.entity.model.festivitie;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Entity
@Table(name = "FESTIVITY")
public class Festivity {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PLACE")
	private String place;

	@Column(name = "START_DATE")
	private Date start;

	@Column(name = "END_DATE")
	private Date end;

	@Builder
	public static Festivity target(Long id, String name, String place, Date start, Date end) {

		Festivity festivity = new Festivity();
		festivity.setId(id);
		festivity.setName(name);
		festivity.setPlace(place);
		festivity.setStart(start);
		festivity.setEnd(end);

		return festivity;
	}

}
