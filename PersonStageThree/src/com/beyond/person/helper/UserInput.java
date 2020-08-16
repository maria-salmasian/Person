package com.beyond.person.helper;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.impl.DancerActionServiceImpl;
import com.beyond.person.core.service.impl.ProgrammerActionServiceImpl;
import com.beyond.person.core.service.impl.SingerActionServiceImpl;
import com.beyond.person.core.utils.enumeration.InputChoice;

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
    public void userInput(int choice, String name, String lastName, String designation) {
        if (choice == Integer.parseInt(InputChoice.DANCER.toString())) {
            dancerInput(name, lastName, designation);
        } else if (choice == Integer.parseInt(InputChoice.SINGER.toString())) {
            singerInput(name, lastName, designation);
        } else if (choice == Integer.parseInt(InputChoice.PROGRAMMER.toString())) {
           programmerInput(name, lastName, designation);
        }

    }


    /**
     * used in the method above, for making the dancer action and checking the validation of designation
     * @param name
     * @param lastName
     * @param designation
     */
    private void dancerInput(String name, String lastName, String designation) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What group does the dancer dance in");
        String groupName = enter.nextLine();
        try {
            BasePerson dancer = new Dancer(name, lastName, groupName, designation);
            dancer.setDesignation(designation);
            DancerActionServiceImpl dancerPerson = (DancerActionServiceImpl) PersonFactory.getPersonType(dancer);
            dancerPerson.all();
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *  used in the method above, for making the singer action and checking the validation of designation
     * @param name
     * @param lastName
     * @param designation
     */
    private void singerInput(String name, String lastName, String designation) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What band does the singer sing in");
        String bandName = enter.nextLine();
        try {
            BasePerson singer = new Singer(name, lastName, bandName, designation);
            singer.setDesignation(designation);
            SingerActionServiceImpl singerPerson = (SingerActionServiceImpl) PersonFactory.getPersonType(singer);
            singerPerson.all();
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *  used in the method above, for making the programmer action and checking the validation of designation
     * @param name
     * @param lastName
     * @param designation
     */
    private void programmerInput(String name, String lastName, String designation) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What company does the programmer work for");
        String companyName = enter.nextLine();
        try {
            BasePerson programmer = new Programmer(name, lastName, companyName, designation);
            programmer.setDesignation(designation);
            ProgrammerActionServiceImpl programmerPerson = (ProgrammerActionServiceImpl) PersonFactory.getPersonType(programmer);
            programmerPerson.all();
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

}

