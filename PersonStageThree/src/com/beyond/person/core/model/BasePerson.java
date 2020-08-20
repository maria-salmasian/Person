package com.beyond.person.core.model;

import com.beyond.person.core.exception.*;
import com.beyond.person.core.utils.enumeration.Gender;

public class BasePerson {
    protected String name;
    protected String lastName;
    protected String nickname;
    protected String email;
    protected String designation;
    protected String gender;
    protected int age;
    private final String emailRegex = "^(.+)@(.+)$";

    /**
     * constructor for base person
     * @param name
     * @param lastName
     */
    public BasePerson(String name, String lastName) throws ValidationException {
        if (lengthCheck(name) && lengthCheck(lastName)) {
            this.name = name;
            this.lastName = lastName;
        } else {
            throw new ValidationException("Invalid Name or Surname");
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private String getNickname() {
        return nickname;
    }

    private String getEmail() {
        return email;
    }

    private String getGender() {
        return gender;
    }

    private int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setNickname(String nickname) throws ValidationException {

        if (lengthCheck(nickname))
            this.nickname = nickname;
        else {
            throw new ValidationException("Invalid Nickname ");
        }
    }


    public void setEmail(String email) throws ValidationException {
        if (email.matches(emailRegex))
            this.email = email;
        else {
            throw new ValidationException("Invalid Email ");
        }

    }

    public void setDesignation(String designation) throws ValidationException {
        if (lengthCheck(designation))
            this.designation = designation;
        else {
            throw new ValidationException("Invalid Designation!");
        }
    }


    public void setGender(String gender) throws ValidationException {
        if (gender.equalsIgnoreCase(String.valueOf(Gender.FEMALE)) || gender.equalsIgnoreCase(String.valueOf(Gender.MALE)))
            this.gender = gender;
        else {
            throw new ValidationException("Invalid Gender");
        }
    }

    public void setAge(String ageInput) throws ValidationException {
        int firstAge = ageValidity(ageInput);
        if (0 < firstAge && firstAge < 100)
            this.age = firstAge;
        else {
            throw new ValidationException("Invalid Age!");
        }
    }


    private int ageValidity(String ageInput) {
        try {
            int firstAge = Integer.parseInt(ageInput);
            return firstAge;

        } catch (NumberFormatException e) {
            System.out.println("age is supposed to be a number");
            System.out.println(e.getMessage());
        }
        return -1;
    }


    private boolean lengthCheck(String string) {
        boolean checked = false;
        if (0 < string.length() && string.length() < 255)
            checked = true;
        return checked;
    }
}
