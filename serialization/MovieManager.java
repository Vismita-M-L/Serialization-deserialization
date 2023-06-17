package com.techlabs.serialization;

    import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class MovieManager {
	    private static final String FILE_PATH = "C:\\Users\\vismi\\OneDrive\\Documents\\Monocept\\Movies.txt";
	    private List<Movie> movies;

	    public MovieManager() {
	        movies = new ArrayList<>();
	    }

	    public void addMovie(Movie movie) {
	        movies.add(movie);
	    }

	    public void saveMovies() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
	            for (Movie movie : movies) {
	                writer.write(movie.getMovieId() + "," + movie.getMovieName() + "," +
	                        movie.getYear() + "," + movie.getGenre());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public void clearMovies() {
	        movies.clear();
	    }

	    public void loadMovies() {
	        try {
	        	List<String> lines = Files.readAllLines(Paths.get(FILE_PATH));
	            for (String line : lines) {
	                String[] parts = line.split(",");
	                if (parts.length == 4) {
	                    int movieId = Integer.parseInt(parts[0]);
	                    String movieName = parts[1];
	                    int year = Integer.parseInt(parts[2]);
	                    String genre = parts[3];
	                    Movie movie = new Movie(movieId, movieName, year, genre);
	                    movies.add(movie);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public List<Movie> getMovies() {
	        return movies;
	    }
	    public Movie getMovieById(int movieId) {
	        for (Movie movie : movies) {
	            if (movie.getMovieId() == movieId) {
	                return movie;
	            }
	        }
	        return null;
	}
	}


	
	


