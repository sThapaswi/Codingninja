public class Solution {
    public static int binarySearchClosest(int []nums, int left, int right, int target) {
        //Your code goes here
       int m =0;
        int closestIndex = -1;
        int minDiff = Integer.MAX_VALUE;

        while(left<=right){
             m= (left+right)/2;
             int diff = Math.abs(nums[m] - target);

            if (diff < minDiff) {
                minDiff = diff;
                closestIndex = m;
            }
            if(nums[m]<target){
                left=m+1;
            }
            if(nums[m]>target){
                right=m-1;
            }
            if(nums[m]==target){
                return m;
            }
           
        }
        return closestIndex;
    }

}