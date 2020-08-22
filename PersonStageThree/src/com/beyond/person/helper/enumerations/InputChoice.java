package com.beyond.person.helper.enumerations;

import com.beyond.person.core.exception.ValidationException;

public enum InputChoice {
    DANCER(1) {
        public String toString() {
            return "1";
        }
    },

    SINGER(2) {
        public String toString() {
            return "2";
        }
    },

    PROGRAMMER(3) {
        public String toString() {
            return "3";
        }
    },

    EXIT(4) {
        public String toString() {
            return "4";
        }
    };

    private int id;

    InputChoice(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static InputChoice getById(int id) throws ValidationException {
        for (InputChoice type : values()) {
            if (type.id == (id)) return type;
        }

        throw new ValidationException("Invalid id: " + id);
    }


}
