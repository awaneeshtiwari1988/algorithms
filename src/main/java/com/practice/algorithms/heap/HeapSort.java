package com.practice.algorithms.heap;

import java.util.Arrays;

public class HeapSort {

    public int[] heapSort(int[] inputArray){
        int length = inputArray.length;
        buildMaxHeap(inputArray);
        for (int i = length - 1; i > 0; i--) {
            int temp = inputArray[0];
            inputArray[0] = inputArray[i];
            inputArray[i] = temp;
            maxHeap(inputArray,i,0);
        }

        return inputArray;
    }

    public void maxHeap(int[] inputArray,int length, int index){
        int left = leftRoot(index);
        int right = rightRoot(index);
        int largest = index;
        if(left < length && inputArray[left] > inputArray[largest]){
            largest = left;
        }

        if(right < length && inputArray[right] > inputArray[largest]){
            largest = right;
        }

        if(largest != index){
            int temp = inputArray[index];
            inputArray[index] = inputArray[largest];
            inputArray[largest] = temp;
            maxHeap(inputArray,length,largest);
        }
    }

    public void buildMaxHeap(int[] inputArray){
        int length = inputArray.length;
        for (int i = (length/2)-1; i >= 0; i--) {
            maxHeap(inputArray, length, i);
        }
    }

    public int leftRoot(int index){
        return 2*index+1;
    }

    public int rightRoot(int index){
        return 2*index+2;
    }
}
