package com.itstep.lesson._13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    // Attributes / Class properties
    public long orderId;

    public User orderUser;

    public List<Item> orderItems; /// 3  items

    // Constructor
    public Order(User orderUser, List<Item> orderItems) {
        this.orderId = new Random().nextLong();
        this.orderUser = orderUser;
        this.orderItems = orderItems;
    }

    //methods
    public ArrayList<Item> filterItemsByType(Type type) {
        ArrayList<Item> filteredItems = new ArrayList<>();

        for (Item tempItem : orderItems) {
            if (tempItem.itemType.equals(type)) {
                filteredItems.add(tempItem);
            }
        }
        return filteredItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderUser=" + orderUser +
                ", orderItems=" + orderItems +
                '}';
    }

}
