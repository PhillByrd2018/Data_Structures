package Sorts;

import java.util.Arrays;

public class Insertion {

    public static int[] testCase1 = {22, -15, 7, 35, 55, 20 ,11, -5, 1};

    public static int[] insertionSwap(int[] nums) {


        for (int firstUnsortedIndex = 1; firstUnsortedIndex < nums.length; firstUnsortedIndex++) {

            int elementToSort = nums[firstUnsortedIndex];

            int searchIndex;

            for(searchIndex = firstUnsortedIndex; searchIndex > 0 && nums[searchIndex-1] > elementToSort; searchIndex--) {
                nums[searchIndex] = nums[searchIndex -1];
            }
            nums[searchIndex] = elementToSort;
        }

        return nums;

    }

    public static void main(String[] args) {
        System.out.println("Expected: [-15, -5, 1, 7, 11, 20, 22, 35, 55] :: Actual: "  + Arrays.toString(insertionSwap(testCase1)));
    }

}