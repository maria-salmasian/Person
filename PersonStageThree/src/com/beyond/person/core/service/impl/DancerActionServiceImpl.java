package com.beyond.person.core.service.impl;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.DancerActionService;
import com.beyond.person.core.utils.enumeration.State;

public class DancerActionServiceImpl implements DancerActionService {
    Dancer dancer;
    State state = State.NONE;

    /**
     * constructor for Dancer Impl
     * @param name
     * @param lastName
     * @param groupName
     * @param designation
     */
    public DancerActionServiceImpl(String name, String lastName, String groupName, String designation) throws ValidationException {
        dancer = new Dancer(name, lastName, groupName, designation);

    }



    @Override
    public void dancing() {
        System.out.println(dancer.getName() + " dances " + dancer.getDesignation() + " at " + dancer.getGroupName());
        System.out.println(dancer.getName() + " dances only after eating");
    }


    @Override
    public void eat() {
        state = State.EATEN;
        System.out.println(dancer.getName() + " eats only 3 times, not more");

    }


    @Override
    public void learn() {
        state = State.LEARNT;
        System.out.println(dancer.getName() + " has a dancing Education");

    }


    @Override
    public void all() {
        learn();
        eat();
        dancing();
        walk(dancer);
        System.out.println();
    }
}
