public class Solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
		int n = input.length;
		int m = input[0].length;
		for(int i =0;i<n;i++){
			int count=n-i;
			while(count>0){
                  for(int j=0;j<m;j++){
					  System.out.print(input[i][j]+ " ");
				  }
				  count--;
				  System.out.println("");
			}
		}
		

	}
}