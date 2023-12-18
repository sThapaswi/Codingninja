
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int n=str.length();
		StringBuilder var = new StringBuilder();
		for(int i=0; i<n;i++){
			var.append(str.charAt(i));
			for(int j=i+1;j<n;j++){
				if(str.charAt(i)==str.charAt(i+1)){
					i++;
				}
		
			}
		}
		return var.toString();
	}

}