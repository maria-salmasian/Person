package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.DanceType;


public class Dancer extends BasePerson {
    private String groupName;
    protected String danceType;
    protected DanceType designation;

    /**
     * constructor for dancer
     *
     * @param name
     * @param lastName
     * @param groupName
     */
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
}
