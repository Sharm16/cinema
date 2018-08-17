package rest;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import business.MovieService;
import persistence.domain.Movie;

public class MovieController {
	@Autowired
	MovieService service;

	@RequestMapping("/getMovie/{id}")
	public Movie getMovieById(@PathVariable String id) throws SQLException {
		return service.getMovieById(id);
	}
	
	@RequestMapping("/addMovie/{id}")
	public void addMovieById(@PathVariable String id)throws SQLException, IOException {
		service.addMovieById(id);
	}

}
