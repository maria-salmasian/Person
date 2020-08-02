package com.beyond.person.core.model;

public class Programmer extends BasePerson {
    protected String companyName;

    /**
     * constructor for programmer
     * @param name
     * @param designation
     * @param companyName
     */
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    /**
     * getter for company name
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }
}