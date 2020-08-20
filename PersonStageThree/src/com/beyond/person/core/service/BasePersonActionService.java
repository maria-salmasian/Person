package com.beyond.person.core.service;

import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.utils.enumeration.State;

public interface BasePersonActionService {

    /**
     * method walk same for all
     *
     * @param person
     */
    default void walk(BasePerson person) {
        State state = State.WALKED;
        System.out.println(person.getName() + " walks like a normal person");
    }


    void eat();

    void learn();

    void all();

}
