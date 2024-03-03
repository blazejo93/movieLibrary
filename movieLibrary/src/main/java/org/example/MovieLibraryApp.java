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
        switch(UserInputHandler.getMenuOption()){
            case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                //TODO dopisać kod dla tej opcji
                break;
            case DISPLAYALLMOVIESFORACTUALACTOR:
                //TODO dopisać kod dla tej opcji
                break;
            case QUIT:
                System.out.println("Wychodzenie");
                System.exit(1);
        }

    }
}