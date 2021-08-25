package com.practice.algorithms;

import com.practice.algorithms.sorting.CountingSort;
import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest {

    @Test
    public void testCountingSort_Input1(){
        CountingSort countingSort = new CountingSort();
        int[] inputArray = {5,2,4,6,1,3};
        int[] outputArray = {1,2,3,4,5,6};
        Assert.assertArrayEquals(outputArray,countingSort.countingSort(inputArray, inputArray.length));
    }

    @Test
    public void testCountingSort_Input2(){
        CountingSort countingSort = new CountingSort();
        int[] inputArray = {6,0,2,0,1,3,4,6,1,3,2};
        int[] outputArray = {0,0,1,1,2,2,3,3,4,6,6};
        Assert.assertArrayEquals(outputArray,countingSort.countingSort(inputArray, inputArray.length));
    }
}
