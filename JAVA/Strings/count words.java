
public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
		int count=1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) ==' ' ){
				count++;
			}
		}
		return count;
	}

}