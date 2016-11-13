/**
 * 
 */
package com.prodigius.core.api.service.domain.festivitie;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author cristiandorado
 *
 */
@Data
@ApiModel(value = "FestivitieQuery", description = "The Festivitie Query Representation")
public class FestivitieQueryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5133105154344638154L;

	private String name;
	private String place;
	private Date start;
	private Date end;

	@Builder
	public static FestivitieQueryDTO target(String name, String place, Date start, Date end) {

		FestivitieQueryDTO dto = new FestivitieQueryDTO();

		dto.setName(name);
		dto.setPlace(place);
		dto.setStart(start);
		dto.setEnd(end);

		return dto;

	}

}
