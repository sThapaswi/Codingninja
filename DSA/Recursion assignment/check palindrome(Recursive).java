public class Solution {
    public static boolean palin(String str, int start, int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return palin(str, start+1, end-1);
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return palin(str, 0, str.length()-1);
    }
}

