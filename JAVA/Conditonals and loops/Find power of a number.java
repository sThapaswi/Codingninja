import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int x=1;
        while(n!=0){
            x  =x*s;
           
            n=n-1;
        }
         System.out.print(x);
    }
}