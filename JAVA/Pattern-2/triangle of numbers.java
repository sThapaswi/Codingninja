import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int spc = 1;
            while (spc <= n - i) {
                System.out.print(" ");
                spc++;
            }
            int j = 1;
           
            int num = i;
            
            while (j <= i) {
                System.out.print(num);
                num++;
                j++;
            }
            
            int ji = i - 1;
            num -= 2;
            
            while (ji >= 1) {
                System.out.print(num);
                num--;
                ji--;
            }
            System.out.println();
            i++;
        }
    }
}
