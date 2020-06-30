package com.itstep.lesson._17;

import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {
        int[] myArray = new int[] {85, 2, -5, 36, 21};
        System.out.println("Initial values are : " + Arrays.toString(myArray));
        bubbleSorting(myArray);

        int indexOfTwo = binarySearch(myArray, 9, 0, myArray.length - 1);

        System.out.println("Number 2 is found on the index " + indexOfTwo);
    }

    private static int binarySearch(int[] array, int searchedNumber, int minBoundary, int maxBoundary) {
        if (maxBoundary >= minBoundary) {
            int midIndex = (minBoundary + maxBoundary) / 2;

            if (array[midIndex] == searchedNumber) {
                return midIndex;
            } else {
                if (array[midIndex] > searchedNumber) {
                    return binarySearch(array, searchedNumber, minBoundary, midIndex - 1);
                }
                return binarySearch(array, searchedNumber, midIndex + 1, maxBoundary);
            }
        }
        return -1;

    }

    private static void bubbleSorting(int[] arrayToSort) {
        int length = arrayToSort.length;

        for (int i = 0; i < length; i++) {
            boolean swapped = false;

            for (int index = 0; index < length - 1 - i; index++) {

                if (arrayToSort[index] > arrayToSort[index + 1]) {

                    int tempInt = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = tempInt;

                    swapped = true;
                }
            }

            System.out.println("Iteration nr - " + (i + 1) + "\n" + Arrays.toString(arrayToSort));
            if (!swapped) {
                break;
            }
        }
    }

}
