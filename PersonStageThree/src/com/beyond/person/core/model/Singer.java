package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.SongType;

public class Singer extends BasePerson {
    protected String bandName;
    protected String songType;

    /**
     * constructor for singer
     *
     * @param name
     * @param lastName
     * @param bandName
     * @param designation
     */
    public Singer(String name, String lastName, String bandName, String designation) throws ValidationException {

        super(name, lastName);
        this.bandName = bandName;
        this.designation = designation;
    }

    public String getBandName() {
        return bandName;
    }

    private String getSongType() {
        return songType;
    }

    public void setDesignation(String designation) throws ValidationException {

        if (designation.equalsIgnoreCase(String.valueOf(SongType.JAZZ)) || designation.equalsIgnoreCase(String.valueOf(SongType.POP))
                || designation.equalsIgnoreCase(String.valueOf(SongType.ROCK)))
            this.designation = designation;
        else {
            throw new ValidationException("Song type not found");
        }


    }
}
