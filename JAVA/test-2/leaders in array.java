

public class Solution {

	public static void leaders(int[] input) {
	 int n = input.length;
       
        
        for(int i=0; i<n; i++){
            boolean smaller = true;
            for(int j = i+1;j<n;j++){
            if(input[i] < input[j]){
                smaller = false;
           
                break;
            }
                }
            
            
            if (smaller){
                System.out.print(input[i] + " ");
            }
        }
		
	}
	
}