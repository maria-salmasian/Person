package com.beyond.person.helper;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.database.Repository;
import com.beyond.person.helper.enumerations.InputChoice;

import java.util.Scanner;

/**
 * class for method start
 */
public class Start {
    /**
     * method start for the program to begin, used in main
     */
    private Repository repository;

    public void start() {
        int count = 0;
        int availableInputs = 3;
        int input;
        Scanner enter = new Scanner(System.in);
        repository = new Repository();
        System.out.println("Hello! Let's create a person");
        while (count < availableInputs) {
            System.out.println("What kind of person do you want to create? 1) dancer  2) singer  3) programmer ");
            System.out.println("Or choose 4) exit to terminate the program");
            input = enter.nextInt();
            try {
                InputChoice choice = InputChoice.getById(input);
                if (!choice.equals(InputChoice.EXIT)) {
                    enter.nextLine();
                    System.out.println("Name:");
                    String name = enter.nextLine();
                    System.out.println("Last Name:");
                    String lastName = enter.nextLine();
                    UserInput userInput = new UserInput();
                    BasePerson person = userInput.userInput(choice, name, lastName);
                    repository.persons.add(person);

                } else {
                    System.out.println("Bye!");
                    System.exit(0);
                }
                System.out.println("do you want to remove a person? 1) yes 2) no ");
                String in = enter.nextLine();
                if (in.equalsIgnoreCase("1")) {
                    System.out.println("Id?");
                    int id = enter.nextInt();
                    repository.removeById(id);
                    for (int i = 0; i < repository.removedPersons.size(); i++) {
                        System.out.println("Removed Persons : " + repository.removedPersons.get(i).getName());
                    }
                } else if (in.equalsIgnoreCase("2")) {
                    for (int i = 0; i < repository.persons.size(); i++) {
                        if (!repository.persons.isEmpty()) {
                            System.out.println("All persons: " + repository.persons.get(i).getName());
                        }
                    }
                }
                throw new ValidationException("invalid input exception");




            } catch (ValidationException e) {
                count++;
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Three invalid inputs! Program terminates.");
        System.exit(0);
    }
}
