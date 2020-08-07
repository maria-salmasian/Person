package com.beyond.person.core.model;

import com.beyond.person.core.exception.*;
import com.beyond.person.core.utils.Gender;

public class BasePerson {
    protected String name;
    protected String lastName;
    protected String nickname;
    protected String email;
    protected String designation;
    protected String gender;
    protected int age;
    protected final String emailRegex = "^(.+)@(.+)$";

    /**
     * constructor for base person
     *
     * @param name
     * @param lastName
     */
    public BasePerson(String name, String lastName) throws InvalidFieldException {
        if (lengthCheck(name, lastName)) {
            this.name = name;
            this.lastName = lastName;
        } else {
            throw new InvalidFieldException("String not supported");
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

    public void setNickname(String nickname) throws InvalidFieldException {

        if (0 < nickname.length() && nickname.length() < 255)
            this.nickname = nickname;
        else {
            throw new InvalidFieldException("String not supported");
        }
    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        if (email.matches(emailRegex))
            this.email = email;
        else {
            throw new InvalidEmailException("Email not found");
        }

    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) throws InvalidFieldException, InvalidTypeException {
        if (!designation.equals("") || designation.length() < 255)
            this.designation = designation;
        else {
            throw new InvalidFieldException("String not supported!");
        }
    }

    private String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidGenderException {
        if (gender.equalsIgnoreCase(String.valueOf(Gender.FEMALE)) || gender.equalsIgnoreCase(String.valueOf(Gender.MALE)))
            this.gender = gender;
        else {
            throw new InvalidGenderException("Gender not found");
        }
    }


    private int getAge() {
        return age;
    }

    private int ageValidity(String ageInput) {
        try {
            int firstAge = Integer.parseInt(ageInput);
            return firstAge;

        } catch (NumberFormatException e) {
            System.out.println("age is supposed to be a number");
        }
        return -1;
    }

    public void setAge(String ageInput) throws InvalidAgeException {
        int firstAge = ageValidity(ageInput);
        if (0 < firstAge && firstAge < 100)
            this.age = firstAge;
        else {
            throw new InvalidAgeException("Invalid Age!");
        }
    }

    private boolean lengthCheck(String name, String lastName) {
        boolean checked = false;
        if (0 < name.length() && name.length() < 255 && 0 < lastName.length() && lastName.length() < 255)
            checked = true;
        return checked;
    }
}
