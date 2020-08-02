package com.beyond.person.core.model;

public class Dancer extends BasePerson {
    private String groupName;

    /**
     * constructor for dancer
     * @param name
     * @param designation
     * @param groupName
     */
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    /**
     * getter for groupName
     * @return
     */
    public String getGroupName() {
        return groupName;
    }
}
