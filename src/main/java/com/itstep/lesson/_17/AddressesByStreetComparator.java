package com.itstep.lesson._17;

import java.util.Comparator;

public class AddressesByStreetComparator implements Comparator<Address> {

    @Override
    public int compare(final Address o1, final Address o2) {
        return o1.getStreet().length() - o2.getStreet().length();
    }

}
