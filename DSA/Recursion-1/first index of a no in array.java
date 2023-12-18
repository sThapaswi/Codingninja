
public class Solution {
	static int first(int arr[], int x, int si){
		if(arr[si]==x){
			return si;
		}
		if(si==arr.length-1){
			return -1;
		}
		return first(arr,x,si+1);
	}

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return first(input,x,0);
	}
	
}