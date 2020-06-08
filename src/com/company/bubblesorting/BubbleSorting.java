package com.company.bubblesorting;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            System.out.println(Arrays.toString(intArray));
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

    }

    private static void swap(int[] intArray, int i, int lastUnsortedIndex) {
        if (i == lastUnsortedIndex) { // this makes Bubble sort stable ... light 9 vs Bold nine swapping
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[lastUnsortedIndex];
        intArray[lastUnsortedIndex] = temp;
    }
}
