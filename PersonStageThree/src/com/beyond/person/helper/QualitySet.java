package com.beyond.person.helper;

import com.beyond.person.core.exception.*;
import com.beyond.person.core.model.BasePerson;

import java.util.ArrayList;

/**
 * provides a method that will set the qualities through the setters
 */
public class QualitySet {

    /**
     * method for setting the values through Setters
     *
     * @param designation
     * @param email
     * @param gender
     * @param nickname
     * @param age
     */
    public void setPerson(String designation, String email,
                          String gender, String nickname, String age, BasePerson personCreated) throws ValidationException {
        personCreated.setAge(age);
        personCreated.setNickname(nickname);
        personCreated.setDesignation(designation);
        personCreated.setEmail(email);
        personCreated.setGender(gender);



    }
}
