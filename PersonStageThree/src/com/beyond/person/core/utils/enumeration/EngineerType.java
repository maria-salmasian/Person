package com.beyond.person.core.utils.enumeration;

import com.beyond.person.core.exception.ValidationException;

public enum EngineerType {
    SOFTWARE(1){
        public String toString(){
            return "1";
        }
    },
    HARDWARE(2){
        public String toString(){
            return "2";
        }
    },
    DATA(3){
        public String toString(){
            return "3";
        }
    };
    private int id;
    EngineerType(int id) {
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public static EngineerType  getById(int id) throws ValidationException {
        for(EngineerType type : values()) {
            if(type.id == (id))
                return type;
        }

        throw new ValidationException("Invalid gender id: " + id);
    }


}
