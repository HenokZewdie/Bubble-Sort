package com.company.bubblesorting;

import java.util.Arrays;

public class SelectionSorting {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestValueIndex = 0; //selection sort use index and swap after the iteration has completed
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largestValueIndex]) {
                    largestValueIndex = i;
                }
            }
            swap(intArray, largestValueIndex, lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(intArray));
    }

    private static void swap(int[] intArray, int i, int lastUnsortedIndex) {
        if (intArray[i] == intArray[lastUnsortedIndex]) {
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[lastUnsortedIndex];
        intArray[lastUnsortedIndex] = temp;
    }
}
