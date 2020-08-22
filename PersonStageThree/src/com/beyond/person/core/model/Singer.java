package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.SongType;

public class Singer extends BasePerson {
    protected String bandName;
    protected String songType;
    protected SongType designation;

    /**
     * constructor for singer
     *
     * @param name
     * @param lastName
     * @param bandName
     */
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
}
