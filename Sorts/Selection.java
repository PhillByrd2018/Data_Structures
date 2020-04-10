package Sorts;

import java.util.Arrays;

public class Selection {

    public static int[] testCase1 = {22, -15, 7, 35, 55, 20 ,11, -5, 1};

    public static int[] selectionSwap(int[] nums){

        for (int lastUnsortedIndex = nums.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for (int j = 0; j <= lastUnsortedIndex;j++) {
                if (nums[j] > nums[indexOfLargest]) {
                    indexOfLargest = j;
                }
            }
            Swap.swap(nums, indexOfLargest, lastUnsortedIndex);
        }
        return nums;
    }
    public static void main(String[] args) {
        
        System.out.println("Expected: [-15, -5, 1, 7, 11, 20, 22, 35, 55] :: Actual: " + Arrays.toString(selectionSwap(testCase1)));
    }

}