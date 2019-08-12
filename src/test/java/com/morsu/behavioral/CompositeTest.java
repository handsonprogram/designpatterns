package com.morsu.behavioral;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeTest {

    @Test
    public void testConstant() {
        double testValue = 3.0;
        Expression e = new Constant(testValue);
        assertEquals(testValue, e.getValue(), 0.0);
    }

    @Test
    public void adder() {
        double testValueA = 3.0;
        double testValueB = 4.0;

        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression adder = new Adder(left, right);
        assertEquals((testValueA+testValueB), adder.getValue(), 0.0);
    }

    @Test
    public void subtractor() {

        double testValueA = 3.0;
        double testValueB = 4.0;

        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression adder = new Subtracter(left, right);
        assertEquals((testValueA-testValueB), adder.getValue(), 0.0);
    }

    @Test
    public void divider() {

        double testValueA = 3.0;
        double testValueB = 4.0;

        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression adder = new Divider(left, right);
        assertEquals((testValueA/testValueB), adder.getValue(), 0.0);
    }

    @Test
    public void multiplier() {

        double testValueA = 3.0;
        double testValueB = 4.0;

        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression adder = new Multiplier(left, right);
        assertEquals((testValueA*testValueB), adder.getValue(), 0.0);
    }

    @Test
    public void testComplexExpression() {
        Expression e = new Divider(
                new Multiplier(
                        new Adder(new Constant(3.0), new Constant(5.0)),
                        new Constant(100)
                ), new Adder(new Constant(2.0), new Constant(64.0))
        );
        assertEquals(12.12121212, e.getValue(), 0.00001);
    }

}
