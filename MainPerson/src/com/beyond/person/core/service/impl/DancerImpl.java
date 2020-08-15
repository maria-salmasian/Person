package com.beyond.person.core.service.impl;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.interfaces.DancerAction;

public class DancerImpl implements DancerAction {
    Dancer dancer;

    /**
     * constructor for Dancer Impl
     * @param name
     * @param designation
     * @param groupName
     */
    public DancerImpl(String name, String designation, String groupName) {
       dancer = new Dancer(name, designation, groupName);
    }


    /**
     * method dancing only for dancer from interface DancerAction
     */
    @Override
    public void dancing() {
        System.out.println(dancer.getName() + " dances at "+  dancer.getGroupName());
    }

    /**
     * eat overriden
     */
    @Override
    public void eat() {
        System.out.println(dancer.getName() + " is vegetarian");

    }

    /**
     * learn overriden
     */
    @Override
    public void learn() {
        System.out.println( dancer.getName() + " has a dancing Education");

    }

    /**
     * all methods of dancer in one
     */
    @Override
    public void all() {
        learn();
        eat();
        dancing();
        walk(dancer);
        System.out.println();
    }
}
