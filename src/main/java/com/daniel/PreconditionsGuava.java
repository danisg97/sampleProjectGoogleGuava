package com.daniel;

import com.google.common.base.Preconditions;

public class PreconditionsGuava {

    /*

    PRECONDITIONS CLASS

    Preconditions provide static methods to check
    that a method or a constructor is invoked with proper parameter or not.
    It checks the pre-conditions. Its methods throw IllegalArgumentException on failure.

    */

    public static void main(String args[]) {
        PreconditionsGuava preconditionsGuava = new PreconditionsGuava();

        try {
            System.out.println(preconditionsGuava.sqrt(-3.0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(preconditionsGuava.sum(null, 3));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(preconditionsGuava.getValue(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public double sqrt(double input) throws IllegalArgumentException {
        Preconditions.checkArgument(input > 0.0, "Illegal Argument passed: Negative value %s.", input);

        return Math.sqrt(input);

    }

    public int sum(Integer a, Integer b) {
        a = Preconditions.checkNotNull(a, "Illegal Argument: First parameter is NULL");
        b = Preconditions.checkNotNull(b, "Illegal Argument: Second parameter is NULL");

        return a+b;

    }

    public int getValue(int input) {
        int[] data = {1,2,3,4,5};
        Preconditions.checkElementIndex(input, data.length, "Illegal Argument passed: Invalid index.");

        return 0;

    }

}
