import java.util.Scanner;
public class Solution {

    public static int minimum_element(int[] arr){
		int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
     
}