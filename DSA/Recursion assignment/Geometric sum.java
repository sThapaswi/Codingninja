
public class solution {

	public static double findGeometric(int k){
		// Write your code here
	    if(k==0){
			return 1;
		}
		
		double g = 1/Math.pow(2,k);
		
	
		double sum =  findGeometric(k-1);
         return sum+g;
	}
	public static double findGeometricSum(int k){
		return findGeometric(k);
	}
}
