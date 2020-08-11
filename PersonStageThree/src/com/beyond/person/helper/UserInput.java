package com.beyond.person.helper;

import com.beyond.person.core.exception.InvalidFieldException;
import com.beyond.person.core.exception.InvalidTypeException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.implementation.DancerImpl;
import com.beyond.person.core.service.implementation.ProgrammerImpl;
import com.beyond.person.core.service.implementation.SingerImpl;

import java.util.Scanner;

public class UserInput {

    /**
     * method for creating the person needed and preforming the actions needed
     *
     * @param choice
     * @param name
     * @param lastName
     * @param designation
     */
    public void userInput(int choice, String name, String lastName, String designation) throws InvalidFieldException {
        Scanner enter = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("What group does the dancer dance in");
            String groupName = enter.nextLine();
            try {
                BasePerson dancer = new Dancer(name, lastName, groupName, designation);
                dancer.setDesignation(designation);
                DancerImpl dancerPerson = (DancerImpl) PersonFactory.getPersonType(dancer);
                dancerPerson.all();
            } catch (InvalidTypeException e) {
                System.out.println(e.getMessage());
            }
        } else if (choice == 2) {
            System.out.println("What band does the singer sing in");
            String bandName = enter.nextLine();
            try {
                BasePerson singer = new Singer(name, lastName, bandName, designation);
                singer.setDesignation(designation);
                SingerImpl singerPerson = (SingerImpl) PersonFactory.getPersonType(singer);
                singerPerson.all();
            } catch (InvalidTypeException e) {
                System.out.println(e.getMessage());
            }
        } else if (choice == 3) {
            System.out.println("What company does the programmer work for");
            String companyName = enter.nextLine();
            try {
                BasePerson programmer = new Programmer(name, lastName, companyName, designation);
                programmer.setDesignation(designation);
                ProgrammerImpl programmerPerson = (ProgrammerImpl) PersonFactory.getPersonType(programmer);
                programmerPerson.all();
            } catch (InvalidTypeException e) {
                System.out.println(e.getMessage());
            }
        }


    }


}

