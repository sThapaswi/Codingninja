import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=10){
			
			int x = n*i;
			System.out.println(x);
			i=i+1;

		}

	}
}