import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
    
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        char ch = c.charAt(0);

        if(ch >= 'A' && ch<='Z' ){
            System.out.print("1");
        }
        if(ch >= 'a' && ch<='z') {
            System.out.print("0");
        }
        if( !Character.isLetter(ch)){
            System.out.print("-1");
        }

    }
}