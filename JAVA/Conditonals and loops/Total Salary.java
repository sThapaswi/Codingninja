import java.util.Scanner;
import java.util.*;

public class Solution{
    public static void main(String[] args) {
        //Write your code here. 
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
    
        String ch = sc.next();
        char grade = ch.charAt(0);
        double hra = 0.2*b;
        double da = 0.5*b;
        double pf = 0.11*b;
        int allow;
       
        

        if(grade == 65){
             allow= 1700;       
        }
         else if(grade == 66){
             allow = 1500;    
        }
        else{
           allow = 1300;

        }
        double totalsalary = b + hra + da +allow - pf;
         double TS = Math.round(totalsalary);
         int h=(int)(TS);
         System.out.println(h);
        


        
        
    }
}