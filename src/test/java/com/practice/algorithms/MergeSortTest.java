package com.practice.algorithms;

import com.practice.algorithms.sorting.MergeSort;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort_Input1(){
        MergeSort mergeSort = new MergeSort();
        int[] inputArray = {5,2,4,6,1,3};
        int[] outputArray = {1,2,3,4,5,6};
        Assert.assertArrayEquals(outputArray,mergeSort.mergeSort(inputArray,0, inputArray.length-1));
    }

    @Test
    public void testMergeSort_Input2(){
        MergeSort mergeSort = new MergeSort();
        int[] inputArray = {31,41,59,26,41,58};
        int[] outputArray = {26,31,41,41,58,59};
        Assert.assertArrayEquals(outputArray,mergeSort.mergeSort(inputArray,0, inputArray.length-1));
    }

    @Test
    public void testMergeSort_Input3(){
        MergeSort mergeSort = new MergeSort();
        int[] inputArray = {3,41,52,26,38,57,9,49};
        int[] outputArray = {3,9,26,38,41,49,52,57};
        Assert.assertArrayEquals(outputArray,mergeSort.mergeSort(inputArray,0, inputArray.length-1));
    }
}
