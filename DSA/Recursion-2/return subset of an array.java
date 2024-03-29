public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		
		return subsetsHelper(input,0);
	}
    
    private static int[][] subsetsHelper(int[] input, int startIndex)
    {
        if (startIndex==input.length)
        {
            return new int[1][0];
        }
        int[][] temp = subsetsHelper(input, startIndex+1);
        
        int[][] smallOutput = new int[temp.length*2][];
        
        for (int i=0;i<temp.length;i++)
        {
            smallOutput[i] = new int[temp[i].length];
            int[] smallTemp = temp[i];
            for (int j=0;j<temp[i].length;j++)
            {
                smallOutput[i][j]=smallTemp[j];
            }
        }
        
        for (int i=0;i<temp.length;i++)
        {
            smallOutput[i+temp.length] = new int[temp[i].length+1];
            smallOutput[i+temp.length][0]=input[startIndex];
            int[] smallTemp = temp[i];
            for (int j=1;j<=temp[i].length;j++)
            {
                smallOutput[i+temp.length][j]=smallTemp[j-1];
            }
        }
       
        return smallOutput;
    }
}