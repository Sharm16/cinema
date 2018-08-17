package business;

import java.io.IOException;
import java.sql.SQLException;

import persistence.domain.Movie;

public interface MovieService {

	Movie getMovieById(String id) throws SQLException;

	void addMovieById(String id)throws SQLException, IOException;

	
}
