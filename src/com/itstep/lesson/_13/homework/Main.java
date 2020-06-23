package com.itstep.lesson._13.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Moldova", "Chisinau", "str. Teilor");
        System.out.println(address.getFullAddress());

        Address address1 = new Address("Moldova", "Ialoveni", "str. Octombrie");
        System.out.println(address1.getFullAddress());

        Map<String, Address> user1Addresses = new HashMap<>();
        user1Addresses.put("HOME", address1);
        user1Addresses.put("WORK", address);

        User user1 = new User("lindajohnson@gmail.com", user1Addresses);
        System.out.println(user1.userId);
        System.out.println(user1.username);

        user1.addAddress("HOME", new Address("Moldova", "Chisinau", "str. Decebal"));

        ArrayList<Item> order1Items = new ArrayList<>();

        Item babyDoll = new Item("Baby Doll", Type.TOYS);
        order1Items.add(babyDoll);

        Item car = new Item("Car", Type.TOYS);
        order1Items.add(car);

        Item tShirt = new Item("T-Shirt", Type.CLOTHES);
        order1Items.add(tShirt);

        Order order1 = new Order(user1, order1Items);

        ArrayList<Item> filtredToys = order1.filterItemsByType(Type.TOYS);
        System.out.println(filtredToys);

        User user2 = new User("mollysmith@gmail.com");

        ArrayList<Item> itemsSecondList = new ArrayList<>();

        Item phone = new Item("IPhone", Type.GADGETS);
        itemsSecondList.add(phone);

        Order order2 = new Order(user2, itemsSecondList);

        ArrayList<Order> allOrders = new ArrayList<>();
        // Collections.addAll(allOrders, order1, order2);
        //
        // List<Order> filteredOrders =filterOrdersByType(Type.TOYS, allOrders);
        // System.out.println(filteredOrders);


    }

    static ArrayList<Order> filterOrdersByType(Type type, List<Order> orders) {
        ArrayList<Order> filteredOrders = new ArrayList<>();

        for (Order tempOrder : orders) {
            ArrayList<Item> itemsByType = tempOrder.filterItemsByType(type);

            if (!itemsByType.isEmpty()) {
                filteredOrders.add(tempOrder);
            }
        }

        return filteredOrders;
    }

}
