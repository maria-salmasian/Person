package com.beyond.person.helper;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.People;

import java.util.Scanner;

/**
 * class for method start
 */
public class Start {
    /**
     * method start for the program to begin, used in main
     */
    public void start() {
        int count = 0;
        int availableInputs = 3;
        String input = "";
        Scanner enter = new Scanner(System.in);
        System.out.println("Hello! Let's create a person");
        while (count < availableInputs) {
            System.out.println("What kind of person do you want to create? 1) dancer  2) singer  3) programmer ");
            System.out.println("Or choose 4) exit to terminate the program");
            input = enter.nextLine();
            try {
                if (!input.equals(People.EXIT.toString())) {
                    if (input.equals(People.DANCER.toString()) || input.equals(People.SINGER.toString())
                            || input.equals(People.PROGRAMMER.toString())) {
                        int choice = Integer.parseInt(input);
                        System.out.println("Name:");
                        String name = enter.nextLine();
                        System.out.println("Last Name:");
                        String lastName = enter.nextLine();
                        System.out.println("Nickname:");
                        String nickname = enter.nextLine();
                        System.out.println("Designation:");
                        String designation = enter.nextLine();
                        System.out.println("Gender:");
                        String gender = enter.nextLine();
                        System.out.println("Email:");
                        String email = enter.nextLine();
                        System.out.println("Age:");
                        String age = enter.nextLine();
                        UserInput userInput = new UserInput();
                        userInput.userInput(choice, name, lastName, designation);
                        QualitySet setQualities = new QualitySet();
                        setQualities.setPerson(name, lastName, designation, email, gender, nickname, age);
                    } else {
                        throw new ValidationException("person not supported");
                    }

                    System.out.println();
                } else {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
                count++;
            }
        }
        System.out.println("Three invalid inputs! Program terminates.");
        System.exit(0);
    }
}
