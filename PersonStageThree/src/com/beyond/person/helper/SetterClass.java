package com.beyond.person.helper;

import com.beyond.person.core.exception.*;
import com.beyond.person.core.model.BasePerson;

public class SetterClass {
    /**
     * method for setting the values
     *
     * @param name
     * @param lastName
     * @param designation
     * @param email
     * @param gender
     * @param nickname
     * @param age
     */
    public void setPerson(String name, String lastName, String designation, String email,
                          String gender, String nickname, String age) throws InvalidFieldException {

        BasePerson personCreated = new BasePerson(name, lastName);

        try {
            personCreated.setAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            personCreated.setNickname(nickname);
            personCreated.setDesignation(designation);
        } catch (InvalidFieldException | InvalidTypeException e) {
            System.out.println(e.getMessage());
        }
        try {
            personCreated.setEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        try {
            personCreated.setGender(gender);
        } catch (InvalidGenderException e) {
            System.out.println(e.getMessage());
        }


    }
}
