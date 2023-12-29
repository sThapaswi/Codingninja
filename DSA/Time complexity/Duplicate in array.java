public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
         int n=0;
        for (int i=0;i<arr.length;i++)
        {
            n=n+arr[i];
        }
        return n-((arr.length-2)*(arr.length-1)/2);
	}
}