package Searches;

import java.util.Arrays;

public class Bubble {

    public static int[] testCase1 = {22, -15, 7, 35, 55, 20 ,11, -5, 1};
    public static int[] testCase2 = {1,2,1,1,1,1,1};
    public static int[] testCase3 = {200, 151, 54, 2 ,-100000, 369, 73, 4};


    public static int[] bubbleSort(int[] nums) {
        
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    Swap.swap(nums, i , j);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        
        System.out.println("Expected: [-15, -5, 1, 7, 11, 20, 22, 35, 55] :: Actual: "  + Arrays.toString(bubbleSort(testCase1)));
        System.out.println("Expected: [1, 1, 1, 1, 1, 1, 2] :: Actual: "  + Arrays.toString(bubbleSort(testCase2)));
        System.out.println("Expected: [] :: Actual: "  + Arrays.toString(bubbleSort(testCase3)));
    }

}