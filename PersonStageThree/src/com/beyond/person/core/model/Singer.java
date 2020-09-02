package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.SongType;

public class Singer extends BasePerson {
    protected String bandName;
    protected String songType;
    protected SongType designation;

    public static class SingerBuilder {
        private String name;
        private String lastName;
        private String nickname;
        private String email;
        private String gender;
        private String designation;
        private String age;
        private String bandName;


        public SingerBuilder(String name, String lastName) throws ValidationException {
            this.name = name;
            this.lastName = lastName;
        }

        public SingerBuilder withNickname(String nickname) throws ValidationException {
            this.nickname = nickname;
            return this;
        }

        public SingerBuilder withEmail(String email) throws ValidationException {
            this.email = email;
            return this;
        }

        public SingerBuilder withGender(String gender) throws ValidationException {
            this.gender = gender;
            return this;
        }

        public SingerBuilder withDesignation(String designation) throws ValidationException {
            this.designation = designation;
            return this;
        }

        public SingerBuilder withAge(String age) throws ValidationException {
            this.age = age;
            return this;
        }

        public SingerBuilder dancingAt(String bandName) {
            this.bandName = bandName;
            return this;
        }


        public Singer buildSinger() throws ValidationException {
            Singer singer = new Singer();
            singer.setName(name);
            singer.setLastName(lastName);
            singer.setGender(gender);
            singer.setDesignation(designation);
            singer.setEmail(email);
            singer.setNickname(nickname);
            singer.setAge(age);
            singer.setBandName(bandName);

            return singer;
        }


    }

    private Singer() {
        super();
    }

    public Singer(String name, String lastName, String bandName) throws ValidationException {

        super(name, lastName);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    private String getSongType() {
        return songType;
    }

    public void setDesignation(String designation) throws ValidationException {
        int genderId = numberValidity(designation);
        SongType type = SongType.getById(genderId);
        this.designation = type;

    }

    public String getDesignation() {
        return designation.toString();
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
