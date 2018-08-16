package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import business.MovieService;
import persistence.domain.Movie;

public class MovieController {
	@Autowired
	MovieService service;

	@RequestMapping("/getMovie/{id}")
	public Movie getTrainerById(@PathVariable Integer id) {
		return service.getMovieById(id);
	}
	
	@RequestMapping("/getMovie/{title}")
	public Movie getTrainerById(@PathVariable String title) {
		return service.getMovieByTitle(title);
	}
}
