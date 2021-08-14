package com.practice.algorithms.sorting;

public class MergeSort {

    public int[] mergeSort(int[] inputArray, int startIndex, int endIndex) {
        if(startIndex < endIndex){
            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(inputArray,startIndex, middleIndex);
            mergeSort(inputArray,middleIndex+1,endIndex);
            mergeProcedure(inputArray,startIndex,middleIndex,endIndex);
        }

        return inputArray;
    }

    public void mergeProcedure(int[] inputArray, int startIndex, int middleIndex, int endIndex){
        int leftArrayLength = middleIndex - startIndex +1;
        int rightArrayLength = endIndex - middleIndex;

        int[] left = new int[leftArrayLength];
        int[] right = new int[rightArrayLength];

        for (int i = 0; i < leftArrayLength; ++i) {
            left[i] = inputArray[startIndex+i];
        }

        for (int j = 0; j < rightArrayLength; ++j) {
            right[j] = inputArray[middleIndex+j+1];
        }

        int i=0,j=0,k=startIndex;

        // Below is the combine logic.
        // In Ascending order: if condition needs to be <=
        // In Descending order: if condition needs to be >=
        while(i < leftArrayLength && j < rightArrayLength) {
            if(left[i] <= right[j]){
                inputArray[k] = left[i];
                i++;
            } else {
                inputArray[k] = right[j];
                j++;
            }
            k++;
        }

        // Fill up all the elements if either of i or j elements are not yet consumed.
        while (i < leftArrayLength) {
            inputArray[k] = left[i];
            i++;
            k++;
        }

        while (j < rightArrayLength) {
            inputArray[k] = right[j];
            j++;
            k++;
        }
    }
}
