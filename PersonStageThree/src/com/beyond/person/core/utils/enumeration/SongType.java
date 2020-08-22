package com.beyond.person.core.utils.enumeration;

import com.beyond.person.core.exception.ValidationException;

public enum SongType {
    JAZZ(1) {
        public String toString() {
            return "1";
        }
    },
    POP(2) {
        public String toString() {
            return "2";
        }
    },
    ROCK(3) {
        public String toString() {
            return "3";
        }
    };

    private int id;

    SongType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static SongType getById(int id) throws ValidationException {
        for (SongType type : values()) {
            if (type.id == (id))
                return type;
        }

        throw new ValidationException("Invalid gender id: " + id);
    }
}
