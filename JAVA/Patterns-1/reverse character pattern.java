import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n){
			int j =1 ;
			char p = (char)('A' + n - 1);
			while(j<=i){
				
				System.out.print(p);
				j=j+1;
				p=(char)(p-1);
			}
			System.out.println();
			i=i+1;
		}
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
