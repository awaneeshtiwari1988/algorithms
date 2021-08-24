package com.practice.algorithms.heap;

public class MaxHeap {

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

    public int leftRoot(int index){
        return 2*index+1;
    }

    public int rightRoot(int index){
        return 2*index+2;
    }
}
