package com.itstep.lesson._3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");

        // String input
        String name = scanner.nextLine();

        String greetings = String.format("Hello, %s!", name);

        System.out.printf("Hello, %s!", name);
    }

}
