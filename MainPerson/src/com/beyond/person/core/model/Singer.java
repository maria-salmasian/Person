package com.beyond.person.core.model;

public class Singer extends BasePerson {
    protected String bandName;

    /**
     * constructor for singer
     * @param name
     * @param designation
     * @param bandName
     */
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    /**
     * getter for band name
     * @return
     */
    public String getBandName() {
        return bandName;
    }

}
