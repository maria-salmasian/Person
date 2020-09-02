package com.beyond.person.core.model;

import com.beyond.person.core.exception.*;
import com.beyond.person.core.utils.enumeration.Gender;

public class BasePerson {
    protected String name;
    protected String lastName;
    protected String nickname;
    protected String email;
    protected Gender gender;
    protected String designation;
    protected int age;
    protected boolean removed;
    protected int id;
    private final String emailRegex = "^(.+)@(.+)$";


    public static class BasePersonBuilder {
        private String name;
        private String lastName;
        private String nickname;
        private String email;
        private String gender;
        private String designation;
        private String age;


        public BasePersonBuilder(String name, String lastName) throws ValidationException {
            this.name = name;
            this.lastName = lastName;
        }

        public BasePersonBuilder withNickname(String nickname) throws ValidationException {
            this.nickname = nickname;
            return this;
        }

        public BasePersonBuilder withEmail(String email) throws ValidationException {
            this.email = email;
            return this;
        }

        public BasePersonBuilder withGender(String gender) throws ValidationException {
            this.gender = gender;
            return this;
        }

        public BasePersonBuilder withDesignation(String designation) throws ValidationException {
            this.designation = designation;
            return this;
        }

        public BasePersonBuilder withAge(String age) throws ValidationException {
            this.age = age;
            return this;
        }


        public BasePerson buildBasePerson() throws ValidationException {
            BasePerson basePerson = new BasePerson();
            basePerson.setName(name);
            basePerson.setLastName(lastName);
            basePerson.setGender(gender);
            basePerson.setDesignation(designation);
            basePerson.setEmail(email);
            basePerson.setNickname(nickname);
            basePerson.setAge(age);

            return basePerson;
        }


    }


    BasePerson() {
    }


    public BasePerson(String name, String lastName) throws ValidationException {
        if (lengthCheck(name) && lengthCheck(lastName)) {
            this.name = name;
            this.lastName = lastName;
        } else throw new ValidationException("Invalid name or surname");
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

    public Gender getGender() {
        return gender;
    }

    private int getAge() {
        return age;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) throws ValidationException {
        if (lengthCheck(name))
            this.name = name;
        else throw new ValidationException("Invalid Name or Surname");
    }

    public void setLastName(String lastName) throws ValidationException {
        if (lengthCheck(lastName))
            this.lastName = lastName;
        else throw new ValidationException("Invalid Name or Surname");
    }

    public void setId(int id) {
        this.id = id;
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
        int genderId = numberValidity(gender);
        Gender x = Gender.getById(genderId);
        this.gender = x;
    }

    public void setAge(String ageInput) throws ValidationException {
        int firstAge = numberValidity(ageInput);
        if (0 < firstAge && firstAge < 100)
            this.age = firstAge;
        else {
            throw new ValidationException("Invalid Age!");
        }
    }


    int numberValidity(String input) {
        try {
            int num = Integer.parseInt(input);
            return num;

        } catch (NumberFormatException e) {
            System.out.println("Invalid number input");
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
