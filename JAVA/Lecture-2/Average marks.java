import java.util.Scanner;
import java.util.*;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char a = str.charAt(0);
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e= (int) (b+c+d)/3;
		System.out.println(a);
		System.out.println(e);



		
	}

}