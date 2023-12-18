import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n){
			int spc =1;
			while(spc<=n-i){
				System.out.print(" ");
				spc = spc+1;
			}
			int j =1 ;
			int p = (2*i)-1;
			while(j<=p){
				System.out.print("*");
				j=j+1;
			}
			
			System.out.println();
			i=i+1;
		}
		
	
	}

}
