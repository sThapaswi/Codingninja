public class Solution {
    public static String getCompressedString(String str) {
        int n = str.length();
        int count = 1;
        StringBuilder v = new StringBuilder();

        for (int i = 0; i < n; i++) {
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            v.append(str.charAt(i));
            if (count > 1) {
                v.append(count); // Append the count after the character
            }
            count = 1; // Reset the count for the next character
        }

        return v.toString();
    }
}
