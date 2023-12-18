public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here

        String minWord="";
        int prev=0;
        int n = input.length();
        for (int i=1;i<n;i++)
        {
            if (input.charAt(i) == ' ')
            {
                String word = input.substring(prev+1,i);
                if (word.length() < minWord.length() || minWord.length() == 0)
                {
                    minWord=word;
                }
                prev=i;
            }
        }
        return minWord;
	}
}