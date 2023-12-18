public class Solution {
    static boolean isPal(char[] str){
       
        int n = str.length;
        if(n==0 || n==1){
            return true;
        }
        if(str[0]!=str[n-1]){
            return false;
        }
        char[] arr = new char[n-2];
        System.arraycopy(str, 1, arr, 0, n - 2);
        return isPal(arr);
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        char[] y = str.toCharArray();
        return isPal(y);
    }
}
