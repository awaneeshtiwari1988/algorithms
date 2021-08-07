package com.practice.algorithms;

import com.practice.algorithms.sorting.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSort_Input1(){
        InsertionSort insertionSort = new InsertionSort();
        int[] inputArray = {5,2,4,6,1,3};
        int[] outputArray = {1,2,3,4,5,6};
        Assert.assertArrayEquals(outputArray,insertionSort.insertionSort(inputArray));
    }

    @Test
    public void testInsertionSort_Input2(){
        InsertionSort insertionSort = new InsertionSort();
        int[] inputArray = {31,41,59,26,41,58};
        int[] outputArray = {26,31,41,41,58,59};
        Assert.assertArrayEquals(outputArray,insertionSort.insertionSort(inputArray));
    }

    @Test
    public void testInsertionSortDesc_Input1(){
        InsertionSort insertionSort = new InsertionSort();
        int[] inputArray = {5,2,4,6,1,3};
        int[] outputArray = {6,5,4,3,2,1};
        Assert.assertArrayEquals(outputArray,insertionSort.insertionSortDesc(inputArray));
    }

    @Test
    public void testInsertionSortDesc_Input2(){
        InsertionSort insertionSort = new InsertionSort();
        int[] inputArray = {31,41,59,26,41,58};
        int[] outputArray = {59,58,41,41,31,26};
        Assert.assertArrayEquals(outputArray,insertionSort.insertionSortDesc(inputArray));
    }
}
