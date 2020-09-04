package com.beyond.person.core.service.impl;

import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.interfaces.ProgrammerAction;

public class ProgrammerImpl implements ProgrammerAction {
    Programmer programmer;

    /**
     * constructor for programmer impl
     * @param name
     * @param designation
     * @param companyName
     */
    public ProgrammerImpl(String name, String designation, String companyName) {
        programmer = new Programmer(name, designation, companyName);

    }

    /**
     * eat overriden
     */
    @Override
    public void eat() {
        System.out.println(programmer.getName() + " eats junk food");
    }

    /**
     * learn overriden
     */
    @Override
    public void learn() {
        System.out.println(programmer.getName() + " has a programming Education");

    }

    /**
     * coding from the interface ProgrammerAction
     */
    @Override
    public void coding() {
        System.out.println(programmer.getName() + " works at " + programmer.getCompanyName());
    }

    /**
     * all methods of programmer in one
     */
    @Override
    public void all() {
        learn();
        eat();
        coding();
        walk(programmer);
        System.out.println();
    }

}
