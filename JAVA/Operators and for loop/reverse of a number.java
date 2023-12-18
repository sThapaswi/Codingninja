import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		
		while(n!=0){
			int j = n%10;
			i = i*10 + j;
			n/=10;
		}
		System.out.print(i);
		// Write your code here

	}
}
