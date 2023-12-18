import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
	
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int r =1;
		while(r<=n){
			int p=(2*r)-1;
			int col = n;
			while(col>0){
				System.out.print(p);
				p = p+2;

				int max = (2*n)-1;
				if(p>max){
					p=1;
				}
				col--;
			}
			System.out.println();
			r++;
		}
		
		// Write your code here
	}
}
