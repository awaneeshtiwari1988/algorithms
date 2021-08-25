package com.practice.algorithms.sorting;

public class CountingSort {

    public int[] countingSort(int[] inputArray, int length){
        int[] outputArray = new int[length];
        int[] temporaryArray = new int[2*length];

        for (int i = 0; i < length; i++) {
            int val = inputArray[i];
            temporaryArray[val] = temporaryArray[val] + 1;
        }

        for (int i = 1; i <= length; i++) {
            temporaryArray[i] = temporaryArray[i] + temporaryArray[i-1];
        }

        for (int i = length-1; i >= 0; i--) {
            outputArray[temporaryArray[inputArray[i]] - 1] = inputArray[i];
            temporaryArray[inputArray[i]] = temporaryArray[inputArray[i]] - 1;
        }
        
        return outputArray;
    }
}
