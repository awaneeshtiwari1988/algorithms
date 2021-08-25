package com.practice.algorithms;

import com.practice.algorithms.sorting.BubbleSort;
import com.practice.algorithms.sorting.CountingSort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort_Input1(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] inputArray = {5,2,4,6,1,3};
        int[] outputArray = {1,2,3,4,5,6};
        Assert.assertArrayEquals(outputArray,bubbleSort.bubbleSort(inputArray));
    }

    @Test
    public void testBubbleSort_Input2(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] inputArray = {6,0,2,0,1,3,4,6,1,3,2};
        int[] outputArray = {0,0,1,1,2,2,3,3,4,6,6};
        Assert.assertArrayEquals(outputArray,bubbleSort.bubbleSort(inputArray));
    }

}
