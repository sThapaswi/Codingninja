
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
		int n =str.length();
		int start=0;
		StringBuilder rev = new StringBuilder();
		for(int i=0;i<=n;i++){
			if(i==n || str.charAt(i)==' '){
				for(int j=i-1;j>=start;j--){
					rev.append(str.charAt(j));
				}if(i<n){
					rev.append(' ');
				}
				start=i+1;
			}
		}
		return rev.toString();

	}

}