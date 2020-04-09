package Searches;

import java.util.Arrays;

public class Shell {

    public static int[] testCase1 = {22, -15, 7, 35, 55, 20 ,11, -5, 1};

    public static int[] shellSort(int[] nums) {

        int gap = nums.length / 2;

        for (int i = gap; i > 0; i /=2) {
            for (int j = i; j < nums.length; j++) {
                int elementToSort = nums[j];

                int g = j;
                while (g >= i && nums[g - i] > elementToSort) {
                    nums[g] = nums[g - i];
                    g -= i;
                }
                nums[g] = elementToSort;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println("Expected: [-15, -5, 1, 7, 11, 20, 22, 35, 55] :: Actual: "  + Arrays.toString(shellSort(testCase1)));
        
    }
}