
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		int n = str.length();
        String x = "";
        for(int i = 0; i<n; i++){
            if (str.charAt(i) != ch){
                x = x+str.charAt(i);
            }
        }
        return x;
	}

}