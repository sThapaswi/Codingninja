import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r=1;
		int sum=0;
		while(r<=n){
			int col=1;
			sum=sum+r;
			while(col<=r){
				System.out.print(col);
				if(col==r){
					System.out.print("=");
				}
				else{
					System.out.print("+");
				}
				col++;
			}
			System.out.print(sum);
			System.out.println();
			r++;
		}
		// Write your code here

	}
}