package com.beyond.person.helper;

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
     * @param choice
     * @param name
     * @param lastName
     * @param designation
     */
    public void userInput(int choice, String name, String lastName, String designation) {
        Scanner enter = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("What group does the dancer dance in");
                String groupName = enter.nextLine();
                BasePerson dancer = new Dancer(name, lastName, groupName, designation);
                DancerImpl dancerPerson = (DancerImpl) PersonFactory.getPersonType(dancer);
                dancerPerson.all();
                break;
            case 2:
                System.out.println("What band does the singer sing in");
                String bandName = enter.nextLine();
                BasePerson singer = new Singer(name, lastName, bandName, designation);
                SingerImpl singerPerson = (SingerImpl) PersonFactory.getPersonType(singer);
                singerPerson.all();
                break;

            case 3:
                System.out.println("What company does the programmer work for");
                String companyName = enter.nextLine();
                BasePerson programmer = new Programmer(name, lastName, companyName, designation);
                ProgrammerImpl programmerPerson = (ProgrammerImpl) PersonFactory.getPersonType(programmer);
                programmerPerson.all();
                break;


        }


    }

}
