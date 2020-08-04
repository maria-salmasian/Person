package com.beyond.person.helper;

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
    public void setPerson(String name, String lastName, String designation, String email, String gender, String nickname, String age){
        BasePerson personCreated = new BasePerson(name, lastName);
        personCreated.setAge(age);
        personCreated.setDesignation(designation);
        personCreated.setEmail(email);
        personCreated.setGender(gender);
        personCreated.setNickname(nickname);
    }
}
