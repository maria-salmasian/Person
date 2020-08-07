package com.beyond.person.entrypoint;

import com.beyond.person.core.exception.InvalidFieldException;
import com.beyond.person.helper.InvalidPersonException;
import com.beyond.person.helper.SetterClass;
import com.beyond.person.helper.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String input = "";
        Scanner enter = new Scanner(System.in);
        System.out.println("Hello! Let's create a person");
        while (count < 3) {
            System.out.println("What kind of person do you want to create? 1) dancer  2) singer  3) programmer ");
            System.out.println("Or choose 4) exit to terminate the program");
            input = enter.nextLine();
            try {
                if (!input.equals("4")) {
                    if (input.equals("1") || input.equals("2") || input.equals("3")) {
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
                        SetterClass setQualities = new SetterClass();
                        setQualities.setPerson(name, lastName, designation, email, gender, nickname, age);
                    } else {
                        throw new InvalidPersonException("person not supported");
                    }

                    System.out.println();
                } else {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            } catch (InvalidPersonException | InvalidFieldException e) {
                System.out.println(e.getMessage());
                count++;
            }
        }
        System.out.println("Three invalid inputs! Program terminates.");
        System.exit(0);
    }
}
