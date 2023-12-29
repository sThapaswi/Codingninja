public class Solution {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // Calculate the middle index.

            // Recursively sort the left and right halves of the array.
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves.
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1; // Size of the left subarray.
        int n2 = r - m;     // Size of the right subarray.

        // Create temporary arrays to hold the left and right subarrays.
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays.
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[m + 1 + j];
        }

        // Merge the two subarrays back into the original array.
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray and rightArray, if any.
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

   
}
