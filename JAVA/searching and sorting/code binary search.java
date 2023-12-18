public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int i=0;
        int m =0;
        int n = nums.length-1;
        while(i<=n){
             m= (i+n)/2;
            if(nums[m]<target){
                i=m+1;
            }
            if(nums[m]>target){
                n=m-1;
            }
            if(nums[m]==target){
                return m;
            }
           
        }
        return -1;
    }
}