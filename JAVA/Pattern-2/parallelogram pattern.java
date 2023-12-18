import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n){
			System.out.print("*");
			j++;
		}
		
		System.out.println();
		int spc=1;
		while(spc<=i){
			System.out.print(" ");
			spc++;
		}
		
		i++;
		}
		// Write your code here

	}
}