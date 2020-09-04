package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.DanceType;


public class Dancer extends BasePerson {
    private String groupName;
    protected String danceType;
    protected DanceType designation;


    public static class DancerBuilder {
        private String name;
        private String lastName;
        private String nickname;
        private String email;
        private String gender;
        private String designation;
        private String age;
        private String groupName;


        public DancerBuilder(String name, String lastName) throws ValidationException {
            this.name = name;
            this.lastName = lastName;
        }

        public DancerBuilder withNickname(String nickname) throws ValidationException {
            this.nickname = nickname;
            return this;
        }

        public DancerBuilder withEmail(String email) throws ValidationException {
            this.email = email;
            return this;
        }

        public DancerBuilder withGender(String gender) throws ValidationException {
            this.gender = gender;
            return this;
        }

        public DancerBuilder withDesignation(String designation) throws ValidationException {
            this.designation = designation;
            return this;
        }

        public DancerBuilder withAge(String age) throws ValidationException {
            this.age = age;
            return this;
        }

        public DancerBuilder dancingAt(String groupName) {
            this.groupName = groupName;
            return this;
        }


        public Dancer buildDancer() throws ValidationException {
            Dancer dancer = new Dancer();
            dancer.setName(name);
            dancer.setLastName(lastName);
            dancer.setGender(gender);
            dancer.setDesignation(designation);
            dancer.setEmail(email);
            dancer.setNickname(nickname);
            dancer.setAge(age);
            dancer.setGroupName(groupName);

            return dancer;
        }


    }

    private Dancer() {
        super();
    }

    public Dancer(String name, String lastName, String groupName) throws ValidationException {
        super(name, lastName);
        this.groupName = groupName;

    }


    public void setDesignation(String designation) throws ValidationException {
        int genderId = numberValidity(designation);
        DanceType type = DanceType.getById(genderId);
        this.designation = type;

    }

    public String getGroupName() {
        return groupName;
    }

    private String getDanceType() {
        return danceType;
    }

    public String getDesignation() {
        return designation.toString();
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
