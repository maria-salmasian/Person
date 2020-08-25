package com.beyond.person.database;

import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.helper.enumerations.InputChoice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {

    public List<BasePerson> persons;
    public List<BasePerson> removedPersons;
    public List<BasePerson> activePersons;
    public List<BasePerson> typePersons;
    public List<BasePerson> typeAndActivePersons;
    public List<BasePerson> typeAndRemovedPersons;

    public Repository() {
        persons = new ArrayList<>();
        removedPersons = new ArrayList<>();
        activePersons = new ArrayList<>();
        typePersons = new ArrayList<>();
        typeAndActivePersons = new ArrayList<>();
        typeAndRemovedPersons = new ArrayList<>();
    }

    public List<BasePerson> findAllPersons() {
        return persons;
    }

    public void removeById(int id) {
        persons.stream().filter(p -> p.getId() == id).collect(Collectors.toList())
                .forEach(x -> {
                    persons.remove(x);
                    removedPersons.add(x);

                });
    }

    public List<BasePerson> getAllRemoved() {
        persons.forEach(p -> {
            if (p.isRemoved()) {
                removedPersons.add(p);
            }
        });
        return removedPersons;
    }

    public List<BasePerson> getAllActive() {
        persons.forEach(p -> {
            if (!p.isRemoved()) {
                activePersons.add(p);
            }
        });
        return activePersons;
    }

    public List<BasePerson> getAllActiveByType(String type) {
        persons.forEach(p -> {
            if (!p.isRemoved()) {
                if (type.equalsIgnoreCase(String.valueOf(InputChoice.DANCER))) {
                    typeAndActivePersons.add(p);
                } else if (type.equalsIgnoreCase(String.valueOf(InputChoice.PROGRAMMER))) {
                    typeAndActivePersons.add(p);
                } else if (type.equalsIgnoreCase(String.valueOf(InputChoice.SINGER))) {
                    typeAndActivePersons.add(p);
                }
            }
        });
        return typeAndActivePersons;
    }

    public List<BasePerson> getAllRemovedByType(String type) {
        persons.forEach(p -> {
            if (p.isRemoved()) {
                if (type.equalsIgnoreCase(String.valueOf(InputChoice.DANCER))) {
                    typeAndRemovedPersons.add(p);
                } else if (type.equalsIgnoreCase(String.valueOf(InputChoice.PROGRAMMER))) {
                    typeAndRemovedPersons.add(p);
                } else if (type.equalsIgnoreCase(String.valueOf(InputChoice.SINGER))) {
                    typeAndRemovedPersons.add(p);
                }
            }
        });
        return typeAndRemovedPersons;
    }

    public BasePerson getById(int id) {
        return persons.stream().filter(p -> p.getId() == id).findAny().orElse(null);
    }

    public List<BasePerson> getAllByType(String type) {
        if (type.equalsIgnoreCase(String.valueOf(InputChoice.DANCER))) {
            persons.forEach(p -> {
                if (p instanceof Dancer)
                    typePersons.add(p);
            });
        } else if (type.equalsIgnoreCase(String.valueOf(InputChoice.PROGRAMMER))) {
            persons.forEach(p -> {
                if (p instanceof Programmer)
                    typePersons.add(p);
            });
        } else if (type.equalsIgnoreCase(String.valueOf(InputChoice.SINGER))) {
            persons.forEach(p -> {
                if (p instanceof Singer) {
                    typePersons.add(p);
                }
            });
        }
        return typePersons;
    }
}
