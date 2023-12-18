
public class Solution {  
         public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        int[] temp = new int[d];
        for(int i = 0;i<d;i++) {
            temp[i] = arr[i];
        }
        int count = 0;
        for(int i = d;i<n;i++) {
            arr[count] = arr[i];
            count++;
        }
        for(int i = 0;i<d;i++) {
            arr[count] = temp[i];
            count++;
        }
    }

    

}