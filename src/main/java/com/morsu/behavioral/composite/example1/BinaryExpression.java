package com.morsu.behavioral.composite.example1;

public abstract class BinaryExpression implements Expression{

    protected final Expression left;
    protected final Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
