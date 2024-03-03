package org.example;

import org.example.handlers.MenuHandlers;
import org.example.handlers.UserInputHandler;
import org.example.models.Movie;
import org.example.models.MovieLibrary;

import static org.example.handlers.MenuOptions.*;

public class MovieLibraryApp {
    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();
        MenuHandlers.print();
        while (true) {
            switch (UserInputHandler.getMenuOption()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYALLMOVIESFORACTUALACTOR:
                    movieLibrary.getMoviesForActor();
                    break;
                case QUIT:
                    System.out.println("Wychodzenie");
                    System.exit(1);
            }
        }
    }
}