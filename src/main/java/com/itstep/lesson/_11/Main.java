package com.itstep.lesson._11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static ArrayList<Integer> number = new ArrayList<>();

    public static void addItemToList() {
        // number;
    }

    public static void deleteItemsFromList() {
        // number;
    }

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("bivol.constnatin@gmail.com", "Test1234");
        users.put("alexandru_93@gmail.com", "SecretPassword");

        String constantinPass = users.get("bivol.constnatin@gmail.com");
        users.put("bivol.constnatin@gmail.com", "SECRET");
        System.out.println(constantinPass);
    }

}

