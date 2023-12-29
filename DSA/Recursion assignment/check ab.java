public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
		int n = input.length();
		if(n==0){
			return true;
		}
		if(input.charAt(0)!='a'){
			return false;
		}
		if(n>=3 && input.substring(0,3).equals("abb")){
			return checkAB(input.substring(3));
		}
		else{
			return checkAB(input.substring(1));
		}

	}
}
