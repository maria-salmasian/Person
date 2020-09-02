package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.EngineerType;

public class Programmer extends BasePerson {
    protected String companyName;
    protected String engineerType;
    protected EngineerType designation;

    public static class ProgrammerBuilder {
        private String name;
        private String lastName;
        private String nickname;
        private String email;
        private String gender;
        private String designation;
        private String age;
        private String companyName;


        public ProgrammerBuilder(String name, String lastName) throws ValidationException {
            this.name = name;
            this.lastName = lastName;
        }

        public ProgrammerBuilder withNickname(String nickname) throws ValidationException {
            this.nickname = nickname;
            return this;
        }

        public ProgrammerBuilder withEmail(String email) throws ValidationException {
            this.email = email;
            return this;
        }

        public ProgrammerBuilder withGender(String gender) throws ValidationException {
            this.gender = gender;
            return this;
        }

        public ProgrammerBuilder withDesignation(String designation) throws ValidationException {
            this.designation = designation;
            return this;
        }

        public ProgrammerBuilder withAge(String age) throws ValidationException {
            this.age = age;
            return this;
        }

        public ProgrammerBuilder codingAt(String companyName) {
            this.companyName = companyName;
            return this;
        }


        public Programmer buildProgrammer() throws ValidationException {
            Programmer programmer = new Programmer();
            programmer.setName(name);
            programmer.setLastName(lastName);
            programmer.setGender(gender);
            programmer.setDesignation(designation);
            programmer.setEmail(email);
            programmer.setNickname(nickname);
            programmer.setAge(age);
            programmer.setCompanyName(companyName);

            return programmer;
        }


    }

    private Programmer() {
        super();
    }

    public Programmer(String name, String lastName, String companyName) throws ValidationException {
        super(name, lastName);
        this.companyName = companyName;

    }

    public String getCompanyName() {
        return companyName;
    }

    private String getEngineerType() {
        return engineerType;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDesignation(String designation) throws ValidationException {
        int genderId = numberValidity(designation);
        EngineerType type = EngineerType.getById(genderId);
        this.designation = type;

    }

    public String getDesignation() {
        return designation.toString();
    }
}
