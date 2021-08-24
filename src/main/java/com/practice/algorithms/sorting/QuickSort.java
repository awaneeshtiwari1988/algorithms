package com.practice.algorithms.sorting;

public class QuickSort {

    public int[] quickSort(int[] inputArray, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int middleIndex = partition(inputArray,startIndex,endIndex);
            quickSort(inputArray,startIndex,middleIndex-1);
            quickSort(inputArray,middleIndex+1,endIndex);
        }

        return inputArray;
    }

    public int partition(int[] inputArray, int startIndex, int endIndex){
        int pivotElement = inputArray[endIndex];
        int index = startIndex - 1;
        for (int i = startIndex; i <= endIndex - 1 ; i++) {
            if(inputArray[i] <= pivotElement){
                index = index +1;
                swap(inputArray,index,i);
            }
        }
        swap(inputArray,index+1, endIndex);
        return index+1;
    }

    public void swap(int[] inputArray, int i, int j){
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
