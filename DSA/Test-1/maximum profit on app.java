import java.util.Arrays;

public class solution {
    public static int maximumProfit(int budget[]) {
        Arrays.sort(budget);

        int maxProfit = Integer.MIN_VALUE;
        int n = budget.length;

        for (int i = 0; i < n; i++) {
            int currentProfit = budget[i] * (n - i);
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}
