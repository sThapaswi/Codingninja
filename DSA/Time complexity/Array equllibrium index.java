public class Solution {

    public static int arrayEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int equilibriumIndex = 0;

        // Calculate the total sum of the array
        for (int value : arr) {
            totalSum += value;
        }

        // Traverse the array and find all equilibrium indexes
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Update total sum by subtracting the current element

            if (leftSum == totalSum) {
                equilibriumIndex = i; // Update equilibrium index
                break; // Break out of the loop after finding the first equilibrium index
            }

            leftSum += arr[i]; // Update left sum by adding the current element
        }
         if (equilibriumIndex == 0) {
            return -1;
            
        } 
        

        return equilibriumIndex;
    }

}
