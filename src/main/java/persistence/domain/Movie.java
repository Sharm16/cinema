package persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


	@Entity
	@Table(name="movie_data")
	public class Movie {
		@Column
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		private int id;
		
		@Column (name="Title")
		private String title;
		
		@Column (name="imdb_id")
		private String imdbID;
		
		@Column (name="Rated")
		private String rated;
		
		@Column (name="Release_date")
		private List<Integer> releaseDate;
		
		@Column (name="Genre")
		private List<String> genre;
		
		@Column (name="Director")
		private String director;
		
		@Column (name="Actors")
		private List<String> actors;
		
		@Column (name="Plot")
		private String plot;
		
		@Column (name="Poster")
		private String poster;
		
		@Column (name="Runtime")
		private int runtime;
		
		@Column (name="ImdbRating")
		private int imdbRating;

		public Movie(int id, String title, String imdbID, String rated, List<Integer> releaseDate, List<String> genre,
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
