 public class Solution {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index.
            } else if (arr[mid] < target) {
                left = mid + 1; // Adjust the left boundary.
            } else {
                right = mid - 1; // Adjust the right boundary.
            }
        }

        return -1; // Element not found in the array.
    }

   
    }

