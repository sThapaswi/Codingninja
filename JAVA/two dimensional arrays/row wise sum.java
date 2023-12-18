public class Solution {

    public static void rowWiseSum(int[][] arr) {
        if (arr.length == 0) {
            return;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum + "\t");
            sum = 0;
        }
        System.out.println();
    }
    }

