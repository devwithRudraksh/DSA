package binarysearch;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 10, 13, 18, 21};  // Must be sorted!
        int target = 10;

        int result = binarySearch(nums, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Binary Search Method (iterative)
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // Prevents overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;  // Not found
    }
}
