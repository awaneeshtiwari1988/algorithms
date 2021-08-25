package com.practice.algorithms.sorting;

public class BubbleSort {

    public int[] bubbleSort(int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = inputArray.length - 1; j >= i+1 ; j--) {
                if(inputArray[j] < inputArray[j-1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j-1];
                    inputArray[j-1] = temp;
                }
            }
        }

        return inputArray;
    }
}
