package com.itstep.lesson._8.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackVsQueue {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        Stack<String> stack = new Stack<>();
        stack.add("First");
        stack.add("Second");
        stack.add("Third");

        System.out.println(queue.peek()); // First
        System.out.println(stack.peek());//Third
    }

}
