
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String ch = str.substring(i,j);
				System.out.println(ch);
			}
		}
		
	}

}