package com.itstep.lesson._8.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("First");

        System.out.println(set);

        Set<Integer> sortedSet = new TreeSet<>();
           sortedSet.add(25);
           sortedSet.add(10);
           sortedSet.add(100);

        System.out.println(sortedSet);
    }

}
