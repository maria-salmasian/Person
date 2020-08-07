package com.beyond.person.core.model;

import com.beyond.person.core.exception.InvalidAgeException;
import com.beyond.person.core.exception.InvalidEmailException;
import com.beyond.person.core.exception.InvalidFieldException;
import com.beyond.person.core.exception.InvalidGenderException;
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
     * @param name
     * @param lastName
     */
    public BasePerson(String name, String lastName) {
        try {
            if (0 < name.length() && name.length() < 255 && 0 < lastName.length() && lastName.length() < 255) {
                this.name = name;
                this.lastName = lastName;
            } else {
                throw new InvalidFieldException();
            }
        } catch (InvalidFieldException e) {
            System.out.println(e.getMessage());
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

    public void setNickname(String nickname) {
        try {
            if (0 < nickname.length() && nickname.length() < 255)
                this.nickname = nickname;
            else {
                throw new InvalidFieldException();
            }
        } catch (InvalidFieldException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean b = email.matches(emailRegex);
        try {
            if (b == true)
                this.email = email;
            else {
                throw new InvalidEmailException();
            }
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        try {
            if (0 < designation.length() && designation.length() < 255)
                this.designation = designation;
            else {
                throw new InvalidFieldException();
            }
        } catch (InvalidFieldException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        try {
            if (gender.equalsIgnoreCase(String.valueOf(Gender.FEMALE)) || gender.equalsIgnoreCase(String.valueOf(Gender.MALE)))
                this.gender = gender;
            else {
                throw new InvalidGenderException();
            }
        } catch (InvalidGenderException e) {
            System.out.println(e.getMessage());
        }
    }

    private int getAge() {
        return age;
    }

    public void setAge(String ageInput) {
        try {
            this.age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            System.out.println("age is supposed to be a number");
        }

        try {
            if (1 < age && age < 100)
                this.age = age;
            else {
                throw new InvalidAgeException();
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
