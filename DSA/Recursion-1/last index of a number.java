
public class Solution {
	static int last(int arr[], int x, int si){
		if(arr[si]==x){
			return si;
		}
		if(si==0){
			return -1;
		}
		return last(arr, x, si-1);
	}

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return last(input, x,input.length-1);
	}
	
}