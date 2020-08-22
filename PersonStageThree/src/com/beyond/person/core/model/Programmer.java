package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.EngineerType;

public class Programmer extends BasePerson {
    protected String companyName;
    protected String engineerType;
    protected EngineerType designation;

    /**
     * constructor for programmer
     *
     * @param name
     * @param lastName
     * @param companyName
     */
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

    public void setDesignation(String designation) throws ValidationException {
        int genderId = numberValidity(designation);
        EngineerType type = EngineerType.getById(genderId);
        this.designation = type;

    }
    public String getDesignation() {
        return designation.toString();
    }
}
