import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int ft=1;
		int st=1;
		int a=0;
		while(i<=n){
			 a = ft;
			

			int nt = ft+st;
			ft=st;
			st=nt;
			i++;
		}
		System.out.print(a);
		
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
