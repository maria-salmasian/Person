package com.beyond.person.core.service.factory;

import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.implementation.DancerImpl;
import com.beyond.person.core.service.implementation.ProgrammerImpl;
import com.beyond.person.core.service.implementation.SingerImpl;
import com.beyond.person.core.service.interfaces.BasePersonAction;

public class PersonFactory {
    /**
     * method for generating person of a type
     * @param person
     * @return
     */
    public static BasePersonAction getPersonType(BasePerson person) {
        if (person instanceof Dancer) {
            Dancer dancer = (Dancer)person;
            return new DancerImpl(dancer.getName(), dancer.getLastName(), dancer.getGroupName(), dancer.getDesignation());

        } else if (person instanceof Singer) {
            Singer singer = (Singer) person;
            return new SingerImpl(singer.getName(), singer.getLastName(), singer.getBandName(), singer.getDesignation());


        } else if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            return new ProgrammerImpl(programmer.getName(), programmer.getLastName(), programmer.getCompanyName(), programmer.getDesignation());

        }

        return null;
    }

}
