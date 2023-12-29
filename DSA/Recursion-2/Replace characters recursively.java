
public class Solution {
	static String replace(String input, char c, char c1){
		if(input.length()==0){
			return input;
		}
		String smalloutput = replace(input.substring(1), c , c1);
		if(input.charAt(0)==c){
			return c1 + smalloutput;
		}else{
			return input.charAt(0) + smalloutput;
		}
	}

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 return replace(input, c1 , c2);

	}
}
