import java.util.Scanner;
class Helper {
	// Method 1
	// Multiplication of 2 numbers
	// Method 2
	// // Multiplication of 3 numbers
	public static int multiply(int a, int b){
		return a*b;
	}
	public static int multiply(int a, int b, int c){
		return a*b*c;
	}
}

// Class 2
class Solution {

	// Main driver method
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);


       
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			int result = Helper.multiply(num1, num2);

            int result1 = Helper.multiply(num1, num2, num3);
            System.out.println(result);
			 System.out.println(result1);
         
            
           

	}
}