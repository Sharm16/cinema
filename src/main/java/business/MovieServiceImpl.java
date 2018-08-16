package business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import persistence.MovieRepository;
import constants.Omdb;
public class MovieServiceImpl {

	@Autowired
	private MovieRepository movieReop;
	@Autowired
	private Omdb  omdb;
	Gson gson = new Gson();
	

	
	public String getMovieById(int id) throws IOException {
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
		String json = gson.toJson(line);
		return line;
	}
	}
