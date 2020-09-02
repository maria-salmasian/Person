package com.beyond.person.core.service.impl;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.ProgrammerActionService;
import com.beyond.person.core.utils.enumeration.EngineerType;
import com.beyond.person.core.utils.enumeration.State;

public class ProgrammerActionServiceImpl implements ProgrammerActionService {
    Programmer programmer;
    State state = State.NONE;

    /**
     * constructor for programmer impl
     * @param name
     * @param lastName
     * @param companyName
     * @param designation
     */
    public ProgrammerActionServiceImpl(String name, String lastName, String companyName, String designation) throws ValidationException {
        programmer = new Programmer(name, lastName, companyName);
        programmer.setDesignation(designation);

    }


    @Override
    public void eat() {
        state = State.EATEN;
        System.out.println(programmer.getName() + " eats unlimited junk food");
    }


    @Override
    public void learn() {
        state = State.LEARNT;
        System.out.println(programmer.getName() + " learns after eating");

    }


    @Override
    public void coding() throws ValidationException {
        System.out.println(programmer.getName() + " works as " + (EngineerType.getById(Integer.parseInt(programmer.getDesignation()))).name().toLowerCase() + " engineer at " + programmer.getCompanyName() + " Codes after learning");
    }

    @Override
    public void action() throws ValidationException {
        coding();
    }

    @Override
    public void all() throws ValidationException {
        eat();
        learn();
        coding();
        walk(programmer);
        System.out.println();
    }

}
