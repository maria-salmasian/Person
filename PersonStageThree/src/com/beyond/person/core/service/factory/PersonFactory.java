package com.beyond.person.core.service.factory;

import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.impl.DancerActionServiceImpl;
import com.beyond.person.core.service.impl.ProgrammerActionServiceImpl;
import com.beyond.person.core.service.impl.SingerActionServiceImpl;
import com.beyond.person.core.service.BasePersonActionService;

public class PersonFactory {
    /**
     * method for generating person of a type
     * @param person
     * @return
     */
    public static BasePersonActionService getPersonType(BasePerson person) throws ValidationException {
        if (person instanceof Dancer) {
            Dancer dancer = (Dancer)person;
            return new DancerActionServiceImpl(dancer.getName(), dancer.getLastName(), dancer.getGroupName(), dancer.getDesignation());

        } else if (person instanceof Singer) {
            Singer singer = (Singer) person;
            return new SingerActionServiceImpl(singer.getName(), singer.getLastName(), singer.getBandName(), singer.getDesignation());


        } else if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            return new ProgrammerActionServiceImpl(programmer.getName(), programmer.getLastName(), programmer.getCompanyName(), programmer.getDesignation());

        }

        else
            throw new ValidationException("Invalid Person Type");

    }

}
