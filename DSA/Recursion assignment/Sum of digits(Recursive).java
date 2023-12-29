
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
     if(input<10){
	     return input;
       }
	   int sum = (input%10);
	   return sum + sumOfDigits(input/10);
	}
}