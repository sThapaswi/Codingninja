import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Value of N for each test case

            // Loop to generate the pattern
            for (int i = 0; i < N; i++) {
                // Print spaces before asterisks
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int j = 0; j < N - i; j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }
    }
}
