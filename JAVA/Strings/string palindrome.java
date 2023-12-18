
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		for(int i =0;i<str.length(); ){
			for(int j=str.length()-1;j>=0;  ){
				if(str.charAt(i)!=str.charAt(j)){
					return false;
				}
				else{
					i++;
					j--;
				}
			}

		}
		return true;
	}

}