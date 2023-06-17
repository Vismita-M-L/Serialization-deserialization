package com.techlabs.serialization;

public class Movie {
	private int MovieId;
	private String MovieName;
	private int year;
	private String Genre;
	public Movie(int movieId, String movieName, int year, String genre) {
		super();
		MovieId = movieId;
		MovieName = movieName;
		this.year = year;
		Genre = genre;
	}
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [MovieId=" + MovieId + ", MovieName=" + MovieName + ", year=" + year + ", Genre=" + Genre + "]";
	}
	
	

}
