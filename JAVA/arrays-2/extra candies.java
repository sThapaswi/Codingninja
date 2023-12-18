import java.util.*;
public class Solution {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        // Write your code here.
        int carry =0;
        int[] ans = new int[n];
        for(int i=0; i<n;i++){
            int l = p1[i]+p2[i]+carry;
            carry=0;
            if(l<=x){
                ans[i]=l;
            }
            else{
                carry=l-x;
                ans[i]=x;
            }
        }
        return ans;
    }
}