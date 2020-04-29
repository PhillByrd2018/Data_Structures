package Sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {

    public static int[] testCase1 = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
    public static int[] testCase2 = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3, 5, 5, 7, 12, 15, 11, 11, 11, 11,};

    public static int[] countingSort(int[] nums) {
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int max = Collections.max(list);
        int min = Collections.min(list);

        int[] count_array = new int[max+1];
        
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            count_array[currentValue]++;
        }
        int[] ans = new int[max];
        int j=0;
        for (int i =1; i < count_array.length;i++) {
            while (count_array[i] > 0){
                ans[j++] = i;
                count_array[i]--;
            }
            
        }

        return ans;
    }

    public static void main(String[] args) {
            // System.out.println("Sorted Array: " + Arrays.toString(countingSort(testCase1)));
            System.out.println("Sorted Array: " + Arrays.toString(countingSort(testCase2)));
    }   
}