package persistence.domain;

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
		
		@Column (name="title")
		private String title;
		
		@Column (name="imdb_id")
		private String imdbID;
		
//		@Column (name="runtime")
//		private int minutes;
//		
//		@Column (name="realease_Date")
//		private String releaseDate;
//		
//		@Column (name="age_rating")
//		private String ageRating;
//		
//		@Column (name="diretor")
//		private String director;

//		public Movie(String title, int minutes, String releaseDate, String ageRating, String director) {
//			
//			this.title = title;
//			this.minutes = minutes;
//			this.releaseDate = releaseDate;
//			this.ageRating = ageRating;
//			this.director = director;
//		}

		
		public Movie() {
			
		}


		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}


		public Movie(int id, String title, String imdbID) {
			super();
			this.id = id;
			this.title = title;
			this.imdbID = imdbID;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getImdbID() {
			return imdbID;
		}


		public void setImdbID(String imdbID) {
			this.imdbID = imdbID;
		}

		
}
