import java.util.*;
public class Solution {
    public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    
    return true;
}
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isNPrime = isPrime(n);
        if (isNPrime) {
            System.out.println("-1");
        } else {
        for(int i=2; i<n;i++){
            if(n%i==0){
            
            System.out.print(i+ " ");
            
        }
        }
       }
        
        
    }
}
