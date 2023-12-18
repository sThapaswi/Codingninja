public class Solution {
    public static int getInversions(int[] arr, int n){
        //Your code goes here
        int inv =0;
        for(int i=0; i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }

            }
            inv+=(mini-i);
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        return inv;
    }

}