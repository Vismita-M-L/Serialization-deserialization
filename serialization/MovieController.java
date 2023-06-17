package com.techlabs.serialization;

import java.util.Scanner;

public class MovieController {
	
	    private MovieManager manager;

	    public MovieController() {
	        manager = new MovieManager();
	    }

	    public void start() {
	        displayMenu();
	    }

	    private void displayMenu() {
	        Scanner scanner = new Scanner(System.in);
	        int choice = 0;

	        do {
	            System.out.println("Movie Store Menu");
	            System.out.println("1. Add Movie");
	            System.out.println("2. Save Movies");
	            System.out.println("3. Clear Movies");
	            System.out.println("4. Load Movies");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    Movie movie = setMovieDetails(scanner);
	                    manager.addMovie(movie);
	                    break;
	                case 2:
	                    manager.saveMovies();
	                    System.out.println("Movies saved to file.");
	                    break;
	                case 3:
	                    manager.clearMovies();
	                    System.out.println("Movies cleared.");
	                    break;
	                case 4:
	                    manager.loadMovies();
	                    System.out.println("Movies loaded from file.");
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } while (choice != 5);
	    }

	    private Movie setMovieDetails(Scanner scanner) {
	        System.out.print("Enter the Movie ID: ");
	        int movieId = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter the Movie Name: ");
	        String movieName = scanner.nextLine();

	        System.out.print("Enter the Year: ");
	        int year = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter the Genre: ");
	        String genre = scanner.nextLine();

	        return new Movie(movieId, movieName, year, genre);
	    }

	    public static void main(String[] args) {
	        MovieController movieController = new MovieController();
	        movieController.start();
	    }
	}


	


