package com.itstep.lesson._17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSorting {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();

        Address address1 = new Address("Decebal", 12, "Chisinau", "Moldova");
        addresses.add(address1);

        addresses.add(new Address("Main", 21, "London", "United Kingdom"));
        addresses.add(new Address("Stefan cel Mare", 1, "Ialoveni", "Moldova"));

        System.out.println("Initial address order: \n" + addresses);

        Collections.sort(addresses);
        System.out.println("After sorting" + addresses);

        int foundedIndex = Collections.binarySearch(addresses, address1);
        System.out.println("Address found on the index " + foundedIndex);

        // AddressesByStreetComparator comparator = new AddressesByStreetComparator();
        //
        // addresses.sort(comparator);

    }

}
