package com.beyond.person.helper;

import com.beyond.person.core.exception.*;
import com.beyond.person.core.model.BasePerson;

/**
 * provides a method that will set the qualities through the setters
 */
public class QualitySet {
    /**
     * method for setting the values through Setters
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
                          String gender, String nickname, String age) throws ValidationException {

        BasePerson personCreated = new BasePerson(name, lastName);
        personCreated.setAge(age);
        personCreated.setNickname(nickname);
        personCreated.setDesignation(designation);
        personCreated.setEmail(email);
        personCreated.setGender(gender);



    }
}
