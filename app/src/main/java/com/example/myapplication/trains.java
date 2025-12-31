package com.example.myapplication;

import java.io.Serializable;

public class trains implements Serializable {
    private int number;

    public trains(int number) {
        if (number < 1) throw new IllegalArgumentException("Number cannot be lower than 1!");
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 1) throw new IllegalArgumentException("Number cannot be lower than 1!");
        this.number = number;
    }
}
