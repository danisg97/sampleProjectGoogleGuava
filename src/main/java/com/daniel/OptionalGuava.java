package com.daniel;

import com.google.common.base.Optional;

public class OptionalGuava {

    /*

    OPTIONAL CLASS

    Optional is an immutable object used to contain a not-null object.
    Optional object is used to represent null with absent value.
    This class has various utility methods to facilitate the code to handle values as available or not available
    instead of checking null values.

    */

    public static void main(String[] args) {
        OptionalGuava optionalGuava = new OptionalGuava();

        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.fromNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.fromNullable(value1);

        // Optional.of - throws NullPointerException if passed parameter is null.
        Optional<Integer> b = Optional.of(value2);

        System.out.println(optionalGuava.sum(a, b));

    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // Optional.isPresent - checks the value is present or not.
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        // Optional.or - returns ths value if present otherwise returns the default value passed.
        Integer value1 = a.or(0);

        // Optional.get - gets the value, value should be present.
        Integer value2 = b.get();

        return value1 + value2;
    }

}