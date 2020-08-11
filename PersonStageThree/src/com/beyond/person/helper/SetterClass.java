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
            personCreated.setNickname(nickname);
            personCreated.setDesignation(designation);
            personCreated.setEmail(email);
            personCreated.setGender(gender);
        } catch (InvalidFieldException | InvalidTypeException | InvalidEmailException |
                InvalidGenderException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
