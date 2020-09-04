package com.beyond.person.core.utils.enumeration;

import com.beyond.person.core.exception.ValidationException;

public enum Gender {
    FEMALE(1){
        public String toString(){
            return "1";
        }
    },
    MALE(2){
        public String toString(){
            return "1";
        }
    };
    private int id;
    Gender(int id) {
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public static Gender  getById(int id) throws ValidationException {
        for(Gender type : values()) {
            if(type.id == (id))
                return type;
        }

        throw new ValidationException("Invalid gender id: " + id);
    }

    }
