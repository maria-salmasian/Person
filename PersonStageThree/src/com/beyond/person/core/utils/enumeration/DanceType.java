package com.beyond.person.core.utils.enumeration;

import com.beyond.person.core.exception.ValidationException;

public enum DanceType {
    LATINO(1){
        public String toString(){
            return "1";
        }
    },
    CONTEMPORARY(2){
        public String toString(){
            return "2";
        }
    },
    ARMENIAN(3){
        public String toString(){
            return "3";
        }
    };
    private int id;
    DanceType(int id) {
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public static DanceType  getById(int id) throws ValidationException {
        for(DanceType type : values()) {
            if(type.id == (id))
                return type;
        }

        throw new ValidationException("Invalid dance id: " + id);
    }

}
