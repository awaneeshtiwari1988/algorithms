package com.practice.algorithms.divideandconquer;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArray {

    public Map<Integer,Integer[]> findMax(int[] inputArray){
        // Create the change array:
        int[] changeArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if(i==0){
                changeArray[i] = 0;
                continue;
            }
            changeArray[i] = inputArray[i] - inputArray[i-1];
        }

        return findMaximumSubArray(changeArray,0,changeArray.length-1);
    }

    public Map<Integer,Integer[]> findMaximumSubArray(int[] inputArray, int startIndex, int endIndex){
        // Check for the base case
        Map<Integer,Integer[]> maximumSubArrayTuple = new HashMap<>();
        Integer[] indexPositionTuple = new Integer[2];
        if(startIndex == endIndex){
            indexPositionTuple[0] = startIndex;
            indexPositionTuple[1] = endIndex;
            maximumSubArrayTuple.put(inputArray[startIndex],indexPositionTuple);
            return maximumSubArrayTuple;
        } else {
            int middleIndex = (startIndex + endIndex)/2;
            Map<Integer,Integer[]> leftMaximumSubArrayTuple = findMaximumSubArray(inputArray,startIndex,middleIndex);
            Map<Integer,Integer[]> rightMaximumSubArrayTuple = findMaximumSubArray(inputArray,middleIndex+1,endIndex);
            Map<Integer,Integer[]> crossingMaxSubArrayTuple = findMaxCrossingSubArray(inputArray,startIndex,middleIndex,endIndex);

            int leftSum =getTupleSum(leftMaximumSubArrayTuple);
            int rightSum = getTupleSum(rightMaximumSubArrayTuple);
            int crossSum = getTupleSum(crossingMaxSubArrayTuple);
            if(leftSum >= rightSum && leftSum >= crossSum){
                return leftMaximumSubArrayTuple;
            } else if (rightSum >= leftSum && rightSum >= crossSum){
                return rightMaximumSubArrayTuple;
            } else {
                return crossingMaxSubArrayTuple;
            }
        }
    }

    private Integer getTupleSum(Map<Integer,Integer[]> maximumSumArrayTuple){
        return maximumSumArrayTuple.keySet().stream().findFirst().get();
    }

    public Map<Integer, Integer[]> findMaxCrossingSubArray(int[] inputArray, int startIndex, int middleIndex, int endIndex){
        int leftSum = 0;
        int sum = 0;
        int indexLeft = 0;
        for (int i = middleIndex; i >= startIndex; i--) {
            sum = sum + inputArray[i];
            if(sum > leftSum){
                leftSum = sum;
                indexLeft = i;
            }
        }

        int indexRight = 0;
        int rightSum = 0;
        sum =0;
        for (int i = middleIndex+1; i < endIndex; i++) {
            sum = sum + inputArray[i];
            if(sum > rightSum){
                rightSum = sum;
                indexRight = i;
            }
        }

        Integer[] subArrayIndexes = new Integer[2];
        subArrayIndexes[0] = indexLeft;
        subArrayIndexes[1] = indexRight;
        Map<Integer,Integer[]> maximumSubArrayTuple = new HashMap<>();
        maximumSubArrayTuple.put(leftSum + rightSum,subArrayIndexes);
        return maximumSubArrayTuple;
    }
}
