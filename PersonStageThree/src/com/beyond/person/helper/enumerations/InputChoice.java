package com.beyond.person.helper.enumerations;

public enum InputChoice {
DANCER(1){
        public String toString(){
            return "1";
        }
    },

    SINGER(2){
        public String toString(){
            return "2";
        }
    },

    PROGRAMMER(3){
        public String toString(){
            return "3";
        }
    },

    EXIT(4){
        public String toString(){
            return "4";
        }
    };

    private int id;
    InputChoice(int id) {
        this.id =id;
    }

    public int getId() {
        return id;
    }


}
