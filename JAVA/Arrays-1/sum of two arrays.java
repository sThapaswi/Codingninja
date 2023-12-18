public class Solution{  
    
    
    public static int[] SumofTwoArrays(int arr1[], int arr2[]) {
        for(int i =0; i<arr1.length;i++){
            arr1[i]+=arr2[i];
            
        }
        return arr1;
    }
}