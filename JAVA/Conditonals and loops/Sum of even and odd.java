import java.util.*; 

public class Main 
{

    public static void main (String[] args) 
    {
        
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        
        int x;
        int even=0,odd =0;
    

    while(n>0)
    {
        x = n%10;
        n = n/10;
       
        
        if(x%2==0)
		even = even + x;
        
           
        else
         odd = odd + x;
           
        

    }
   
    System.out.println(even+" "+ odd);

    }

}