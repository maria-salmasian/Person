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
import com.beyond.person.helper.enumerations.InputChoice;

import java.util.Scanner;

public class UserInput {
    Scanner enter = new Scanner(System.in);
    public static int id = 1;
    /**
     * method for creating the person needed and preforming the actions needed
     *
     * @param choice
     * @param name
     * @param lastName
     */


    public BasePerson userInput(InputChoice choice, String name, String lastName) {
        if (choice.equals(InputChoice.DANCER)) {
            Dancer dancer = dancerInput(name, lastName);
            return dancer;
        } else if (choice.equals(InputChoice.SINGER)) {
            Singer singer = singerInput(name, lastName);
            return singer;
        } else if (choice.equals(InputChoice.PROGRAMMER)) {
            Programmer programmer = programmerInput(name, lastName);
            return programmer;
        }
        return null;
    }


    /**
     * used in the method above, for making the dancer action and checking the validation of designation
     *
     * @param name
     * @param lastName
     */
    private Dancer dancerInput(String name, String lastName) {
        System.out.println("Nickname:");
        String nickname = enter.nextLine();
        System.out.println("Gender: 1) female 2) male");
        String gender = enter.nextLine();
        System.out.println("Email:");
        String email = enter.nextLine();
        System.out.println("Age:");
        String age = enter.nextLine();
        System.out.println("Designation: 1) latino 2) contemporary 3) armenian");
        String designation = enter.nextLine();
        System.out.println("What group does the dancer dance in");
        String groupName = enter.nextLine();
        try {
            Dancer dancer = new Dancer(name, lastName, groupName);
            dancer.setDesignation(designation);
            QualitySet set = new QualitySet();
            set.setPerson(id,designation, email, gender, nickname, age, dancer);
            DancerActionServiceImpl dancerPerson = (DancerActionServiceImpl) PersonFactory.getPersonType(dancer);
            dancerPerson.all();
            id++;
            return dancer;
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * used in the method above, for making the singer action and checking the validation of designation
     *
     * @param name
     * @param lastName
     */
    private Singer singerInput(String name, String lastName) {
        System.out.println("Nickname:");
        String nickname = enter.nextLine();
        System.out.println("Gender: 1) female 2) male");
        String gender = enter.nextLine();
        System.out.println("Email:");
        String email = enter.nextLine();
        System.out.println("Age:");
        String age = enter.nextLine();
        System.out.println("Designation: 1) jazz 2) pop 3) rock ");
        String designation = enter.nextLine();
        System.out.println("What band does the singer sing in");
        String bandName = enter.nextLine();
        try {
            Singer singer = new Singer(name, lastName, bandName);
            singer.setDesignation(designation);
            QualitySet set = new QualitySet();
            set.setPerson(id,designation, email, gender, nickname, age, singer);
            SingerActionServiceImpl singerPerson = (SingerActionServiceImpl) PersonFactory.getPersonType(singer);
            singerPerson.all();
            id++;
            return singer;
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * used in the method above, for making the programmer action and checking the validation of designation
     *
     * @param name
     * @param lastName
     */
    private Programmer programmerInput(String name, String lastName) {
        int id = 0;
        System.out.println("Nickname:");
        String nickname = enter.nextLine();
        System.out.println("Gender: 1) female 2) male");
        String gender = enter.nextLine();
        System.out.println("Email:");
        String email = enter.nextLine();
        System.out.println("Age:");
        String age = enter.nextLine();
        System.out.println("Designation: 1) software 2) hardware 3) data");
        String designation = enter.nextLine();
        System.out.println("What company does the programmer work for");
        String companyName = enter.nextLine();
        id++;
        try {
            Programmer programmer = new Programmer(name, lastName, companyName);
            programmer.setDesignation(designation);
            QualitySet set = new QualitySet();
            set.setPerson(id,designation, email, gender, nickname, age, programmer);
            ProgrammerActionServiceImpl programmerPerson = (ProgrammerActionServiceImpl) PersonFactory.getPersonType(programmer);
            programmerPerson.all();
            id++;
            return programmer;
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

