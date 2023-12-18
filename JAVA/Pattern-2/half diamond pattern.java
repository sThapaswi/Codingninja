import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("*");

        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println("*");
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println("*");
        }

        // Last line of the pattern
        System.out.println("*");
    }
}