import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i  = 1;
		while(i<= n){
			int spc = 1;
			while(spc<=n-i){
				System.out.print(" ");
				spc = spc+1;
			}
			int num=1;
			int p = n;
			while(num<=i){
				System.out.print(num);
				num=num+1;

			}
			System.out.println();
			i=i+1;
		}
		
	

		
	}

}
