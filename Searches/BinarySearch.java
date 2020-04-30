package Searches;

public class BinarySearch {

    public static int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    public static int[] testCase2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

    public static boolean binarySearchAnArrayRecursive(int[] nums, int find, int start, int end) {

        if (start >= end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == find) {
            return true;
        } else if (nums[mid] < find) {
            start = mid + 1;
            return binarySearchAnArrayRecursive(nums, find, start, end);
        } else {
            end = mid;
            return binarySearchAnArrayRecursive(nums, find, start, end);
        }
    }

    public static boolean binarySearchAnArray(int[] nums, int find) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            int currentCheckValue = nums[mid];
            System.out.println("Midpoint: " + mid);
            if (currentCheckValue == find) {
                return true;
            } else if (currentCheckValue > find) {
                end = mid;
            } else if (currentCheckValue < find) {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Found value: 7 :: " + binarySearchAnArrayRecursive(testCase1, 7, 0, testCase1.length - 1));
        System.out.println("Found value: 700 :: " + binarySearchAnArrayRecursive(testCase1, 700, 0, testCase1.length - 1));
        // System.out.println("Found value: 7 :: " + binarySearchAnArray(testCase1, 7));
        // System.out.println("Found value: 100 :: " + binarySearchAnArray(testCase1, 100));
        // System.out.println("Found value: 2 :: " + binarySearchAnArray(testCase1, 2));
        // System.out.println("Found value: 20 :: " + binarySearchAnArray(testCase2, 20));

    }
}