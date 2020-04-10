package Sorts;

import java.util.Arrays;

public class Swap {


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] temp = { 1, 2, 3, 4, 5 };
        swap(temp, 1, 2);
        System.out.println("Swapping: " + Arrays.toString(temp));
        swap(temp, 1, 4);
        System.out.println("Swapping: " + Arrays.toString(temp));

        
    }
}