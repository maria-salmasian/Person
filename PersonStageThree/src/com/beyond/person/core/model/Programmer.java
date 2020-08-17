package com.beyond.person.core.model;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.utils.enumeration.EngineerType;

public class Programmer extends BasePerson {
    protected String companyName;
    protected String engineerType;

    /**
     * constructor for programmer
     *
     * @param name
     * @param lastName
     * @param companyName
     * @param designation
     */
    public Programmer(String name, String lastName, String companyName, String designation) throws ValidationException {
        super(name, lastName);
        this.companyName = companyName;
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    private String getEngineerType() {
        return engineerType;
    }

    public void setDesignation(String designation) throws ValidationException {
        if (designation.equalsIgnoreCase(String.valueOf(EngineerType.DATA)) || designation.equalsIgnoreCase(String.valueOf(EngineerType.HARDWARE))
                || designation.equalsIgnoreCase(String.valueOf(EngineerType.SOFTWARE)))
            this.designation = designation;
        else {
            throw new ValidationException("Engineer type not found");
        }

    }
}
