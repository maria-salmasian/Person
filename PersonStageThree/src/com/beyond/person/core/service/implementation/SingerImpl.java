package com.beyond.person.core.service.implementation;

import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.interfaces.SingerAction;
import com.beyond.person.core.utils.State;

public class SingerImpl implements SingerAction {
    Singer singer;
    State state = State.NONE;

    /**
     * constructor for singer impl
     * @param name
     * @param lastName
     * @param bandName
     * @param designation
     */
    public SingerImpl(String name, String lastName, String bandName, String designation) {
        singer = new Singer(name, lastName, bandName, designation);

    }

    /**
     * eat overriden
     */
    @Override
    public void eat() {
        state = State.EATEN;
        System.out.println(singer.getName() + " has a special diet");

    }

    /**
     * learn overriden
     */
    @Override
    public void learn() {
        state = State.LEARNT;
        System.out.println(singer.getName() + " has a singing Education");
    }

    /**
     * method singing from the interface SingerAction
     */
    @Override
    public void singing() {
        System.out.println(singer.getName() + " plays " + singer.getDesignation() + " at " + singer.getBandName());
        System.out.println("And can only play after eating and walking, and can only sing after eating");
    }

    @Override
    public void all() {
        learn();
        eat();
        singing();
        walk(singer);
        System.out.println();
    }
}
