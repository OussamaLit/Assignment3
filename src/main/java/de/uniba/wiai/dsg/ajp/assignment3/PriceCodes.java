package de.uniba.wiai.dsg.ajp.assignment3;

public enum PriceCodes {

    CHILDRENS(2),
    REGULAR(0),
    NEW_RELEASE(1),
    STAFFELN(1);


    private int value;

    PriceCodes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
