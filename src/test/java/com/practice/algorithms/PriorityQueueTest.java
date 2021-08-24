package com.practice.algorithms;

import com.practice.algorithms.heap.HeapSort;
import com.practice.algorithms.heap.MaxHeap;
import com.practice.algorithms.heap.PriorityQueue;
import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueTest {

    @Test
    public void testPriorityQueue_ExtractMax(){
        PriorityQueue priorityQueue = new PriorityQueue();
        int[] inputArray = {15,13,9,5,12,8,7,4,0,6,2,1};
        Assert.assertEquals(15, priorityQueue.heapExtractMax(inputArray));
    }

    @Test
    public void testPriorityQueue_InsertKey(){
        PriorityQueue priorityQueue = new PriorityQueue();
        int[] inputArray = {15,13,9,5,12,8,7,4,0,6,2,1};
        int[] outputArray = priorityQueue.maxHeapInsert(inputArray,10);
        MaxHeap maxHeap = new MaxHeap();
        int length = outputArray.length;
        for (int i = (length/2)-1; i >= 0; i--) {
            maxHeap.maxHeap(outputArray, length, i);
        }
        int[] expectedOutputArray = outputArray;
        Assert.assertArrayEquals(expectedOutputArray, outputArray);
    }
}
