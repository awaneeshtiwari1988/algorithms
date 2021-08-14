package com.practice.algorithms.sorting;

public class InsertionSort {

    public int[] insertionSort(int[] inputArray){
        int key,j;
        for (int i = 0; i < inputArray.length; i++) {
            key = inputArray[i];
            j = i-1;
            while (j >= 0 && inputArray[j] > key){
                inputArray[j+1] = inputArray[j];
                j = j -1;
            }
            inputArray[j+1] = key;
        }

        return inputArray;
    }

    public int[] insertionSortDesc(int[] inputArray){
        int key,j;
        for (int i = 0; i < inputArray.length; i++) {
            key = inputArray[i];
            j = i-1;
            while (j >=0 && key > inputArray[j]) {
                inputArray[j+1] = inputArray[j];
                j = j -1;
            }
            inputArray[j+1] = key;
        }

        return inputArray;
    }
}
