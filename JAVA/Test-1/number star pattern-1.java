import java.util.*;
public class runner {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(n-j);
            }
            System.out.print("*");


            for (int j = 1; j < i; j++) {
                System.out.print(i-j);
            }


            System.out.println();
        }

	}
}