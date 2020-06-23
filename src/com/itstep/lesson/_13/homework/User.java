package com.itstep.lesson._13.homework;

import java.util.HashMap;
import java.util.Map;

public class User { //class of type User

    public static long idCounter = 0L;

    public long userId;

    public String username;

    public Map<String, Address> userAddresses;

    // Constructors ( Creation Instructions for Data Type - User )
    public User(String username, Map<String, Address> userAddresses) {

        this.userId = idCounter++;
        this.username = username;
        this.userAddresses = userAddresses;
    }

    public User(String username) {
        this.userId = idCounter++;

        this.username = username;
        this.userAddresses = new HashMap<>();
    }

    public void addAddress(String location, Address address) {
        userAddresses.put(location, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAddresses=" + userAddresses +
                '}';
    }

}
