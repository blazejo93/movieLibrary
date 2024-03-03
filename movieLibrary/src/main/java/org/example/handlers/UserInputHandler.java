package org.example.handlers;

import org.example.models.Actor;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);

    private static int getIntegerFromUser() {
        while (!scanner.hasNextInt()) {

            scanner.nextLine();
            System.out.println("This is not integer, Try again");
        }
        return scanner.nextInt();
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();

        scanner.nextLine();
        if (result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println("You selected non existing option, Try again");
            return getSelectedOptionFromUser();
        }
    }

    public static MenuOptions getMenuOption() {
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];
    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scanner.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }
}

