package com.beyond.person.core.service.impl;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.SingerActionService;
import com.beyond.person.core.utils.enumeration.DanceType;
import com.beyond.person.core.utils.enumeration.SongType;
import com.beyond.person.core.utils.enumeration.State;

public class SingerActionServiceImpl implements SingerActionService {
    Singer singer;
    State state = State.NONE;

    /**
     * constructor for singer impl
     *
     * @param name
     * @param lastName
     * @param bandName
     * @param designation
     */
    public SingerActionServiceImpl(String name, String lastName, String bandName, String designation) throws ValidationException {
        singer = new Singer(name, lastName, bandName);
        singer.setDesignation(designation);

    }


    @Override
    public void eat() {
        state = State.EATEN;
        System.out.println(singer.getName() + " has a special diet");

    }


    @Override
    public void learn() {
        state = State.LEARNT;
        System.out.println(singer.getName() + " has a singing Education");
    }


    @Override
    public void singing() throws ValidationException {
        System.out.println(singer.getName() + " plays " + (SongType.getById(Integer.parseInt(singer.getDesignation()))).name().toLowerCase() + " at " + singer.getBandName());
        System.out.println("And can only play after eating and walking, and can only sing after eating");
    }

    @Override
    public void all() throws ValidationException {
        learn();
        eat();
        singing();
        walk(singer);
        System.out.println();
    }
}
