package com.beyond.person.core.service.implementation;

import com.beyond.person.core.exception.InvalidFieldException;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.interfaces.DancerAction;
import com.beyond.person.core.utils.State;

public class DancerImpl implements DancerAction {
    Dancer dancer;
    State state = State.NONE;

    /**
     * constructor for Dancer Impl
     * @param name
     * @param lastName
     * @param groupName
     * @param designation
     */
    public DancerImpl(String name, String lastName, String groupName, String designation) throws InvalidFieldException {
        dancer = new Dancer(name, lastName, groupName, designation);

    }


    /**
     * method dancing only for dancer from interface DancerAction
     */
    @Override
    public void dancing() {
        System.out.println(dancer.getName() + " dances " + dancer.getDesignation() + " at " + dancer.getGroupName());
        System.out.println(dancer.getName() + " dances only after eating");
    }

    /**
     * eat overriden
     */
    @Override
    public void eat() {
        state = State.EATEN;
        System.out.println(dancer.getName() + " eats only 3 times, not more");

    }

    /**
     * learn overriden
     */
    @Override
    public void learn() {
        state = State.LEARNT;
        System.out.println(dancer.getName() + " has a dancing Education");

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
