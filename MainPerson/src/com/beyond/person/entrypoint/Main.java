package com.beyond.person.entrypoint;

import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.Factory.PersonFactory;
import com.beyond.person.core.service.implementation.DancerImpl;
import com.beyond.person.core.service.implementation.ProgrammerImpl;
import com.beyond.person.core.service.implementation.SingerImpl;

public class Main {
    public static void main(String[] args) {
        BasePerson dancer = new Dancer("Annie", "dancer", "Latino");
        BasePerson programmer = new Programmer("Alex", "programmer", "Microsoft");
        BasePerson singer = new Singer("Chris", "singer", "Coldplay");

        DancerImpl dancerPerson = (DancerImpl) PersonFactory.getPersonType(dancer);
        dancerPerson.all();

        SingerImpl singerPerson = (SingerImpl) PersonFactory.getPersonType(singer);
        singerPerson.all();

        ProgrammerImpl programmerPerson = (ProgrammerImpl) PersonFactory.getPersonType(programmer);
        programmerPerson.all();


    }
}
