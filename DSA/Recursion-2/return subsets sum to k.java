public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return subsetsSumKHelper(input,k,0);
	}
    
    public static int[][] subsetsSumKHelper(int input[], int k, int startIndex)
    {
        
        if (startIndex==input.length)
        {
            int arr[][];
            if (k==0)
            {
                 arr = new int[1][0];
            }
            else
            {
                arr = new int[0][0];
            }
            return arr;
        }
        
       
        int temp1[][] = subsetsSumKHelper(input,k-input[startIndex],startIndex+1);
        int temp2[][] = subsetsSumKHelper(input,k,startIndex+1);
        
       
        int output[][] = new int[temp1.length+temp2.length][];
        for (int i=0;i<temp2.length;i++)
        {
            output[i] = new int[temp2[i].length];
            for (int j=0;j<temp2[i].length;j++)
            {
                output[i][j]=temp2[i][j];
            }
        } 
        
        for (int i=0;i<temp1.length;i++)
        {
            output[i+temp2.length] = new int[temp1[i].length+1];
            output[i+temp2.length][0] = input[startIndex];
            for (int j=1;j<output[i+temp2.length].length;j++)
            {
                output[i+temp2.length][j]=temp1[i][j-1];
            }
        }
        
        return output;
    }
}