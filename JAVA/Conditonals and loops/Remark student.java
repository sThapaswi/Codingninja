import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int  n = sc.nextInt();
		 if(75 < n && n<100  ){
			 System.out.print("Distinction");
		 }
		 else if(50<n && n<75){
			  System.out.print("Average");

		 }
		 else if (35<n && n<50){
			 	System.out.print("Below Average");

		 }
	}
}