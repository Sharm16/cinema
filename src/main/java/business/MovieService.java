package business;

import persistence.domain.Movie;

public interface MovieService {

	Movie getMovieById(int id);

	Movie getMovieByTitle(String title);

	
}
