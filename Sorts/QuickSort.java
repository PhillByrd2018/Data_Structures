package Sorts;

import java.util.Arrays;


//O(nlogn)  Space In place
public class QuickSort {

    public static int[] testCase1 = {20, 35, -15, 7, 55, 1, -22};

    public static void quickSort(int[] nums, int start, int end){

        if (end - start < 2) {
            return;
        }


        int pivotIndex = partition(nums, start,end);
        quickSort(nums, start, pivotIndex);
        quickSort(nums, pivotIndex+1, end);

    }

    public static int partition(int[] nums, int start, int end){

        int pivot = nums[start];
        int i = start;
        int j = end;
        
        while(i<j) {

            //empty loop body
            while(i<j && nums[--j] >= pivot);
            if (i < j) {
                nums[i] = nums[j];
            }

            //empty loop body
            while(i<j && nums[++i] <= pivot);
            if (i<j) {
                nums[j] = nums[i];
            }
        }
        nums[j] = pivot;

        return j;
    }
    public static void main(String[] args) {
        quickSort(testCase1, 0, testCase1.length);
        System.out.println("Expected: [-22, -15, 1, 7, 20, 35, 55] :: Actual: " + Arrays.toString(testCase1));
    }
}