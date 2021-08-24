package com.practice.algorithms;

import com.practice.algorithms.heap.PriorityQueue;
import com.practice.algorithms.sorting.QuickSort;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort(){
        QuickSort quickSort = new QuickSort();
        int[] inputArray = {5,2,4,6,1,3};
        int[] outputArray = {1,2,3,4,5,6};
        Assert.assertArrayEquals(outputArray,quickSort.quickSort(inputArray,0, inputArray.length-1));
    }
}
