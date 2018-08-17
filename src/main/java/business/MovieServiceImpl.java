package business;


import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import persistence.MovieRepository;
import persistence.domain.Movie;

public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieReop;
	@Autowired
	private MovieDto movieDto;
	Gson gson = new Gson();
	
	

	@Override
	public Movie getMovieById(String id) throws SQLException {
		 Connection c = null;
	     Statement stmt = null;
	     try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/cinema",
	            "postgres", "admin");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      stmt = c.createStatement();
	         String sql = "query";
	         stmt.executeUpdate(sql);
	         stmt.close();
	      
	         c.close();
	     // System.out.println("Opened database successfully");
	   
		return null;
	}

	@Override
	public void addMovieById(String id)throws SQLException, IOException {
		movieDto.addMovie(id);

	}
}
