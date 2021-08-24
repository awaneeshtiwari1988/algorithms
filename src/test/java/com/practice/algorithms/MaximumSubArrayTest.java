package com.practice.algorithms;

import com.practice.algorithms.divideandconquer.MaximumSubArray;
import com.practice.algorithms.sorting.MergeSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArrayTest {

    @Test
    public void testFindMax_Input1(){
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] inputArray = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
        Map<Integer,Integer[]> maximumSubArrayTuple = new HashMap<>();
        Integer[] maximumSum = {8,11};
        maximumSubArrayTuple.put(43,maximumSum);
        Map<Integer,Integer[]> actualMaximumSubArrayTuple = maximumSubArray.findMax(inputArray);
        Assert.assertTrue(maximumSubArrayTuple.keySet().containsAll(actualMaximumSubArrayTuple.keySet()));
        maximumSubArrayTuple.keySet().forEach(key -> {
            Assert.assertArrayEquals(maximumSubArrayTuple.get(key),actualMaximumSubArrayTuple.get(key));
        });
    }
}
