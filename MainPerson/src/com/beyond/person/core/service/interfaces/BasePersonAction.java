package com.beyond.person.core.service.interfaces;

import com.beyond.person.core.model.BasePerson;

public interface BasePersonAction {
    /**
     * method walk same for all
     * @param person
     */
    default void walk(BasePerson person){

        System.out.println( person.getName() + " walks like a normal person");
    }

    /**
     * general methods for person
     */
    void eat();
    void learn();
    void all();


}
