package com.daniel;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrderingGuava {

    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(1);
        numbers.add(2);
        numbers.add(32);
        numbers.add(67);
        numbers.add(80);
        numbers.add(50);

        Ordering ordering = Ordering.natural();
        // Number list.
        System.out.println("(1) Number list: " + numbers);

        // Sort method - List, Comparator.
        Collections.sort(numbers, ordering);
        // Sorted list.
        System.out.println("(2) Sorted list: " + numbers);

        System.out.println("List is sorted: " + ordering.isOrdered(numbers));
        System.out.println("Minimum: " + ordering.min(numbers));
        System.out.println("Max: " + ordering.max(numbers));

        Collections.sort(numbers, ordering.reverse());
        System.out.println("(3) Reverse: " + numbers);

        numbers.add(null);
        System.out.println("Null added to Reversed list: " + numbers);

        Collections.sort(numbers, ordering.nullsFirst());
        System.out.println("Reversed list with null value: " + numbers);

        List<String> names = new ArrayList<String>();
        names.add("Daniel");
        names.add("Juan");
        names.add("Maria");
        names.add("Angel");
        names.add(null);
        names.add("Ana");

        System.out.println("List names: " + names);

        Collections.sort(names, ordering.nullsFirst().reverse());
        System.out.println("Null first then reverse sorted list: " + names);

    }

}
