package com.beyond.person.core.model;

import com.beyond.person.core.exception.InvalidTypeException;
import com.beyond.person.core.utils.SongType;

public class Singer extends BasePerson {
    protected String bandName;
    protected String songType;

    /**
     * constructor for singer
     * @param name
     * @param lastName
     * @param bandName
     * @param designation
     */
    public Singer(String name, String lastName, String bandName, String designation) {

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

    public void setDesignation(String designation) {
        try{
            if(designation.equalsIgnoreCase(String.valueOf(SongType.JAZZ)) || designation.equalsIgnoreCase(String.valueOf(SongType.POP))
                    || designation.equalsIgnoreCase(String.valueOf(SongType.ROCK)))
                this.designation = designation;
            else{
                throw new InvalidTypeException();
            }
        }
        catch (InvalidTypeException e){
            System.out.println(e.getMessage());
        }


    }
}
