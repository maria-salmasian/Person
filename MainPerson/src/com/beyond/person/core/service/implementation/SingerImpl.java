package com.beyond.person.core.service.implementation;

import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.interfaces.SingerAction;

public class SingerImpl implements SingerAction {
    Singer singer;

    /**
     * constructor for singer impl
     * @param name
     * @param designation
     * @param bandName
     */
    public SingerImpl(String name, String designation, String bandName) {
        singer = new Singer(name, designation, bandName);

    }

    /**
     * eat overriden
     */
    @Override
    public void eat() {
        System.out.println(singer.getName() + " has a special diet");

    }

    /**
     * learn overriden
     */
    @Override
    public void learn() {
        System.out.println(singer.getName() + " has a dancing Education");
    }

    /**
     * method singing from the interface SingerAction
     */
    @Override
    public void singing() {
        System.out.println(singer.getName() + " plays at" + singer. getBandName());
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
