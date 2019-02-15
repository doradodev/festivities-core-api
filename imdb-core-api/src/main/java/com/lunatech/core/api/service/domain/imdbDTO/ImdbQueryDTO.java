/**
 * 
 */
package com.lunatech.core.api.service.domain.imdbDTO;

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
@ApiModel(value = "ImdbQuery", description = "The Imdb QueryString Representation")
public class ImdbQueryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5133105154344638154L;

	private String name;
	private String place;
	private Date start;
	private Date end;

	@Builder
	public static ImdbQueryDTO target(String name, String place, Date start, Date end) {

		ImdbQueryDTO dto = new ImdbQueryDTO();

		dto.setName(name);
		dto.setPlace(place);
		dto.setStart(start);
		dto.setEnd(end);

		return dto;

	}

}
