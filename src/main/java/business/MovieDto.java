package business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.google.gson.Gson;

import constants.Omdb;
import utility.MovieConverter;

public class MovieDto {
	private Omdb omdb;
	private MovieConverter converter;

	Gson gson = new Gson();

	private int id;

	private String title;

	private String imdbID;

	private String rated;

	private List<Integer> releaseDate;

	private List<String> genre;

	private String director;

	private List<String> actors;

	private String plot;

	private String poster;

	private int runtime;

	private int imdbRating;

	public MovieDto(int id, String title, String imdbID, String rated, List<Integer> releaseDate, List<String> genre,
			String director, List<String> actors, String plot, String poster, int runtime, int imdbRating) {
		super();
		this.id = id;
		this.title = title;
		this.imdbID = imdbID;
		this.rated = rated;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.director = director;
		this.actors = actors;
		this.plot = plot;
		this.poster = poster;
		this.runtime = runtime;
		this.imdbRating = imdbRating;
	}

	public String getMovieByIdFromOmdb(String id) throws IOException {
		// This method gets the data of a movie from the OMdb database by using the imdb
		String apiKey = omdb.getApiKey();
		String link = "http://www.omdbapi.com/?i=" + id + apiKey;

		URL url = new URL(link);

		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

		String line;
		{
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();

		}
		return line;
	}

	public void addMovie(String id) throws SQLException, IOException {
		// This method will add the movie to the database using the imdb id and the data
		// taken from the above method
		String str = getMovieByIdFromOmdb(id);
		String json = gson.toJson(str);
		// gets a string value as result 
		Connection c = null;
		Statement stmt = null;
		String query = "insert into movie_db(id,imdb_id,title,rated,release_date,genre,director,actors,plot,poster,runtime,imdbrating) values("
				+ converter.stringToQuery(str) + ")";
		// this is the query your entering into the database, look at the format and
		// values it takes in make sure when you convert the string its in the correct
		// format
		// Use the method from movie converter to get the string into a format of
		// values(attribute 1 value, attribute 2 value...)
		// if you cant get it in the order above, you can change the order inside the
		// brackets above.
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cinema", "postgres", "admin");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		stmt = c.createStatement();
		String sql = query;
		stmt.executeUpdate(sql);
		stmt.close();

		c.close();
	}
	
	public void getMovieFromDb(String id) throws SQLException, IOException {
		// This method will add the movie to the database using the imdb id and the data
		// taken from the above method
		String str = getMovieByIdFromOmdb(id);
		
		// gets a string value as result
		Connection c = null;
		Statement stmt = null;
		String query = "select * from movie_db where imdb_id ="+id;
		// this is the query your entering into the database, look at the format and
		// values it takes in make sure when you convert the string its in the correct
		// format
		// Use the method from movie converter to get the string into a format of
		// values(attribute 1 value, attribute 2 value...)
		// if you cant get it in the order above, you can change the order inside the
		// brackets above.
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cinema", "postgres", "admin");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		stmt = c.createStatement();
		String sql = query;
		stmt.executeUpdate(sql);
		stmt.close();

		c.close();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public List<Integer> getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(List<Integer> releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}

}
