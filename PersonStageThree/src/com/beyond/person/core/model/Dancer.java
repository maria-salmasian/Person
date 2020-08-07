package com.beyond.person.core.model;

import com.beyond.person.core.exception.InvalidFieldException;
import com.beyond.person.core.exception.InvalidTypeException;
import com.beyond.person.core.utils.DanceType;

public class Dancer extends BasePerson {
    private String groupName;
    protected String danceType;

    /**
     * constructor for dancer
     *
     * @param name
     * @param lastName
     * @param groupName
     * @param designation
     */
    public Dancer(String name, String lastName, String groupName, String designation) throws InvalidFieldException {
        super(name, lastName);
        this.groupName = groupName;
        this.designation = designation;
    }

    @Override
    public void setDesignation(String designation) throws InvalidTypeException {
        if (designation.equalsIgnoreCase(String.valueOf(DanceType.LATINO)) || designation.equalsIgnoreCase(String.valueOf(DanceType.ARMENIAN))
                || designation.equalsIgnoreCase(String.valueOf(DanceType.CONTEMPORARY)))
            this.designation = designation;
        else {
            throw new InvalidTypeException("Type not found");
        }


    }

    public String getGroupName() {
        return groupName;
    }

    private String getDanceType() {
        return danceType;
    }

}
