package com.itstep.lesson._4;

public class Main {

    public static void main(String[] args) {
        int[][] myNumbers = {
                            {1, 2, 3, 4},
                            {5, 6, 7}
                                        };

        for (int i = 0; i < myNumbers.length; ++i) {
            System.out.print("[ ");
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + ", ");
            }
            System.out.println(" ]");
        }

    }

}