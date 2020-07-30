package com.beyond.person.core.model;

public class BasePerson {
    protected String name;
    protected String designation;


    /**
     * constructor for base person
     * @param name
     * @param designation
     */
    public BasePerson(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    /**
     * getters for name and designation
     * @return
     */
    public String getName() {

        return name;
    }

    public String getDesignation() {
        return designation;
    }

}
