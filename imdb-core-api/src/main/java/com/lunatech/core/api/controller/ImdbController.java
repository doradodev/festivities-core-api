package com.lunatech.core.api.controller;

import com.lunatech.core.api.service.domain.DTO.MovieQueryDTO;
import com.lunatech.core.api.service.domain.DTO.RatingQueryDTO;
import com.lunatech.core.service.DTO.MoviesCharacter;
import com.lunatech.core.service.DTO.TitleRating;
import com.lunatech.core.service.model.BasicService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author cristiandorado
 *
 */
@RestController
@Api(value = "api-imdb", description = "Imdb Mvc Endpoint", produces = APPLICATION_JSON_VALUE)
@RequestMapping(value = "/api/imdb", produces = APPLICATION_JSON_VALUE)
public class ImdbController {

	
	BasicService basicService;

	@Autowired
	public ImdbController( BasicService basicService) {

		
		this.basicService = basicService;
	}

	@ApiOperation(value = "Get QueryString imdb", notes = "Find all imdb according to a query search parameters", response = TitleRating.class, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "All imdb according to a query search parameters"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 401, message = "Unauthorized Request"),
			@ApiResponse(code = 404, message = "Imdb Not Found"),
			@ApiResponse(code = 500, message = "Unexpected Internal Server Error") })

	@RequestMapping(value = "/findTopRating", method = POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TitleRating>> basicQuery(
        @ApiParam(value = "The QueryString object", required = true) @RequestBody(required = true) RatingQueryDTO query) {
		
		return new ResponseEntity<List<TitleRating>>(basicService.findTopRatingMoviesByGenre(query.getGenre()), OK);
	}
	
	@ApiOperation(value = "Get QueryString imdb", notes = "Find all imdb according to a query search parameters", response = MoviesCharacter.class, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "All imdb according to a query search parameters"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 401, message = "Unauthorized Request"),
			@ApiResponse(code = 404, message = "Imdb Not Found"),
			@ApiResponse(code = 500, message = "Unexpected Internal Server Error") })

	@RequestMapping(value = "/findMovieByTitle", method = POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MoviesCharacter>> movieQuery(
        @ApiParam(value = "The QueryString object", required = true) @RequestBody(required = true) MovieQueryDTO query) {
		
		return new ResponseEntity<List<MoviesCharacter>>(basicService.findMoviesByTitle(query.getTitle()), OK);
	}
}
