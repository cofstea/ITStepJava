package com.itstep.lesson._8.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListVsLinkedList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(0, "1");
        linkedList.add(1, "2");
        linkedList.add("4");
        linkedList.add(2, "3");
        linkedList.addFirst("0");
        System.out.println(linkedList);
    }
}
