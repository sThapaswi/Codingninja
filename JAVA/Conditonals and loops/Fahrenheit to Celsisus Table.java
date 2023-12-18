import java.util.*;

public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();		
		int g = sc.nextInt();
		int f =0;
	
		while(s<=e){
			f = (s-32)*5/9;
			System.out.println(s+ " " +f);
			s=s+g;

		}


		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
