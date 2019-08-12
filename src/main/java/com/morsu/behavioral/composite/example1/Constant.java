package com.morsu.behavioral.composite.example1;

public class Constant implements Expression {

    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return this.value;
    }

}
