package com.itstep.lesson._8.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Second");
        map.put(3, "Third");
        map.put(2, "First");

        System.out.println(map);

        Map<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(2, "Second");
        sortedMap.put(3, "Third");
        sortedMap.put(1, "First");
        sortedMap.put(3, "Fourth");

        System.out.println(sortedMap);
    }
}
