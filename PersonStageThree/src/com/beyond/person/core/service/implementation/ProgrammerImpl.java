package com.beyond.person.core.service.implementation;

import com.beyond.person.core.exception.InvalidFieldException;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.interfaces.ProgrammerAction;
import com.beyond.person.core.utils.State;

public class ProgrammerImpl implements ProgrammerAction {
    Programmer programmer;
    State state = State.NONE;

    /**
     * constructor for programmer impl
     * @param name
     * @param lastName
     * @param companyName
     * @param designation
     */
    public ProgrammerImpl(String name, String lastName, String companyName, String designation) throws InvalidFieldException {
        programmer = new Programmer(name, lastName, companyName, designation);

    }

    /**
     * eat overriden
     */
    @Override
    public void eat() {
        state = State.EATEN;
        System.out.println(programmer.getName() + " eats unlimited junk food");
    }

    /**
     * learn overriden
     */
    @Override
    public void learn() {
        state = State.LEARNT;
        System.out.println(programmer.getName() + " learns after eating");

    }

    /**
     * coding from the interface ProgrammerAction
     */
    @Override
    public void coding() {
        System.out.println(programmer.getName() + " works as " + programmer.getDesignation() + " at " + programmer.getCompanyName() + " Codes after learning");
    }

    /**
     * all methods of programmer in one
     */
    @Override
    public void all() {
        eat();
        learn();
        coding();
        walk(programmer);
        System.out.println();
    }

}
