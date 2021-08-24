package com.practice.algorithms;

import com.practice.algorithms.heap.HeapSort;
import com.practice.algorithms.sorting.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

public class HeapSortTest {

    @Test
    public void testHeapSort_Input1(){
        HeapSort heapSort = new HeapSort();
        int[] inputArray = {4,1,3,2,16,9,10,14,8,7};
        int[] outputArray = {1,2,3,4,7,8,9,10,14,16};
        Assert.assertArrayEquals(outputArray, heapSort.heapSort(inputArray));
    }

    @Test
    public void testHeapSort_Input2(){
        HeapSort heapSort = new HeapSort();
        int[] inputArray = {5,13,2,25,7,17,20,8,4};
        int[] outputArray = {2,4,5,7,8,13,17,20,25};
        Assert.assertArrayEquals(outputArray, heapSort.heapSort(inputArray));
    }

    @Test
    public void testHeapSort_Input3(){
        HeapSort heapSort = new HeapSort();
        int[] inputArray = {1,23,12,9,30,2,50};
        int[] outputArray = {1,2,9,12,23,30,50};
        Assert.assertArrayEquals(outputArray, heapSort.heapSort(inputArray));
    }
}
