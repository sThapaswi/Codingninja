public class Solution {
    public static String reverseWordWise(String input) {
        String reversed = "";
        int start = input.length();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (i == 0) {
                reversed += input.substring(0, start);
            } else if (input.charAt(i) == ' ') {
                reversed += input.substring(i + 1, start) + " ";
                start = i;
            }
        }

        return reversed;
    }
}
