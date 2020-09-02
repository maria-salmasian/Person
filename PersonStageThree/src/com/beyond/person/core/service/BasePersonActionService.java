package com.beyond.person.core.service;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
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

    /**
     * template method
     * @param person
     * @throws ValidationException
     */

    default void allActions(BasePerson person) throws ValidationException {
        learn();
        eat();
        action();
        walk(person);
        System.out.println();


    }

    void action() throws ValidationException;
    void eat();

    void learn();

    void all() throws ValidationException;

}
