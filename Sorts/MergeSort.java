package Sorts;

import java.util.Arrays;

public class MergeSort {

    public static int[] testCase1 = { 20, 35, -15, 7, 55, 1, -22 };
    public static int[] testCase2 = { 214, 356, 2, -100000000, -15, 12, 854, 7, -55, 112985, -22 };

    public static void mergeSort(int[] nums, int start, int end) {

        // array length one is sorted array
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);
        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {

        if (nums[mid - 1] <= nums[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }

        // this is an optimization that handles leftover elements from our partitioned
        // arrays.
            // the source = the input array
            // we start the copy from position i - the last element from the left partition
            // the destination array is the same input array
            // the destination position is the start of our source array plus the last
            // element from our temp array of sorted elements.
            //our length is the right partitions last index of handled elements minus the number of handled elements from the left partition.
        System.arraycopy(nums, i, nums, start + tempIndex, mid - i);

        // this is the last set of our merge. 
            // we take the temp array that holds our sorted elements and now arrange them back into the input array.
            // the temp array or sorted elements.
            // we start the copy from the front the of the temp array
            //our destination is the input array
            //we copy to the input array starting from the start index we passed into this method
            // we copy to the input array ending at the last index from our sorted temp array.
        System.arraycopy(temp, 0, nums, start, tempIndex);
    }

    public static void main(String[] args) {

        mergeSort(testCase1, 0, testCase1.length);
        System.out.println("Expected: [-22, -15, 1, 7, 20, 35, 55] :: Actual: " + Arrays.toString(testCase1));
        mergeSort(testCase2, 0, testCase2.length);
        System.out.println("Expected: [-100000000, -55, -22, -15, 2, 7, 12, 214, 356, 854, 112985] :: Actual: "
                + Arrays.toString(testCase2));
    }
}