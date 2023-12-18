import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            char jth = 'A';
            jth = (char) (jth + i - 1); // Increment jth for each iteration of the outer loop

            while (j <= i) {
                System.out.print(jth);
                j = j + 1;
            }

            System.out.println();

            i = i + 1;
        }
    }
}