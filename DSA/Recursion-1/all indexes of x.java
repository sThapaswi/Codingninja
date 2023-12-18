
public class Solution {
	static int[] all(int arr[],int x, int si){
		if(si==arr.length){
			int[] y = new int[0];
			return y;
		}
		if(arr[si]==x){
			System.out.print(si+" ");
		}
		return all(arr, x, si+1);
	}

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return all(input, x, 0);
		
	}
	
}