
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		int n = s.length();
		if(n<=1){
			return s;
		}
		if(s.charAt(0)==s.charAt(1)){
			return s.charAt(0)+ "*"+ addStars(s.substring(1));
		}else{
			return  s.charAt(0)+addStars(s.substring(1)) ;
		}
		
		

	}
}
