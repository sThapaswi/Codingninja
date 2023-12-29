public class solution {
    private static boolean splitArray(int[] input, int si, int g1, int g2) {
        if (si == input.length) {
            return g1 == g2;
        }

        if (input[si] % 3 == 0) {
            g1 += input[si];
        } else if (input[si] % 5 == 0) {
            g2 += input[si];
        } else {
            return splitArray(input, si + 1, g1 + input[si], g2) || splitArray(input, si + 1, g1, g2 + input[si]);
        }

        return splitArray(input, si + 1, g1, g2);
    }

    public static boolean splitArray(int[] input) {
        return splitArray(input, 0, 0, 0);
    }
}
