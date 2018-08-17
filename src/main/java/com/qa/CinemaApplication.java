package com.qa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) throws SQLException {
//		 Connection c = null;
//	      Statement stmt = null;
		SpringApplication.run(CinemaApplication.class, args);
//	      try {
//	         Class.forName("org.postgresql.Driver");
//	         c = DriverManager
//	            .getConnection("jdbc:postgresql://localhost:5432/cinema",
//	            "postgres", "admin");
//	      } catch (Exception e) {
//	         e.printStackTrace();
//	         System.err.println(e.getClass().getName()+": "+e.getMessage());
//	         System.exit(0);
//	      }
//	      stmt = c.createStatement();
//	         String sql = "INSERT INTO movie_db (imdb_id,id,information) "
//	            + "VALUES ('testid', 1, '{\"Title\":\"Test\",\"Year\":\"2008\",\"Rated\":\"PG-13\",\"Released\":\"02 May 2008\",\"Runtime\":\"126 min\",\"Genre\":\"Action, Adventure, Sci-Fi\",\"Director\":\"Jon Favreau\",\"Writer\":\"Mark Fergus (screenplay), Hawk Ostby (screenplay), Art Marcum (screenplay), Matt Holloway (screenplay), Stan Lee (characters), Don Heck (characters), Larry Lieber (characters), Jack Kirby (characters)\",\"Actors\":\"Robert Downey Jr., Terrence Howard, Jeff Bridges, Gwyneth Paltrow\",\"Plot\":\"After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.\",\"Language\":\"English, Persian, Urdu, Arabic, Hungarian\",\"Country\":\"USA\",\"Awards\":\"Nominated for 2 Oscars. Another 20 wins & 65 nominations.\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BMTczNTI2ODUwOF5BMl5BanBnXkFtZTcwMTU0NTIzMw@@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"7.9/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"94%\"},{\"Source\":\"Metacritic\",\"Value\":\"79/100\"}],\"Metascore\":\"79\",\"imdbRating\":\"7.9\",\"imdbVotes\":\"803,914\",\"imdbID\":\"tt0371746\",\"Type\":\"movie\",\"DVD\":\"30 Sep 2008\",\"BoxOffice\":\"$318,298,180\",\"Production\":\"Paramount Pictures\",\"Website\":\"http://www.ironmanmovie.com/\",\"Response\":\"True\"}');";
//	         stmt.executeUpdate(sql);
//	         stmt.close();
//	      
//	         c.close();
//	      System.out.println("Opened database successfully");
	   }
	}

