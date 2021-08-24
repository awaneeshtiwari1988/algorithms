package com.practice.algorithms.heap;

public class PriorityQueue {

    public int heapMaximum(int[] inputArray){
        return inputArray[1];
    }

    public int heapExtractMax(int[] inputArray){
        if(inputArray.length == 0){
            return -1;
        }

        int length = inputArray.length;
        int max = inputArray[0];
        inputArray[0] = inputArray[length-1];
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.maxHeap(inputArray,length-1,0);
        return max;
    }

    public void heapIncreaseKey(int[] inputArray, int index, int key){
        if(key < inputArray[index]){
            throw new IllegalArgumentException("New key is smaller than the current key");
        }

        inputArray[index] = key;
        int parent = index/2;
        while (index > 0 && inputArray[parent] < inputArray[index]){
            int temp = inputArray[index];
            inputArray[index] = inputArray[parent];
            inputArray[parent] = temp;
            index = index/2;
        }
    }

    public int[] maxHeapInsert(int[] inputArray, int key){
        int length = inputArray.length + 1;
        int[] newInputArray = new int[length];
        if (inputArray.length - 1 >= 0) System.arraycopy(inputArray, 0, newInputArray, 0, inputArray.length - 1);

        heapIncreaseKey(newInputArray,length-1,key);
        return newInputArray;
    }

}
