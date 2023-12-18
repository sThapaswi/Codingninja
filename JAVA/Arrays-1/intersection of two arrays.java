
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int val=0;
        for(int i=0; i<arr1.length;i++){
            for(int j =0; i<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                      System.out.print(arr1[i]+ " ");
                       arr2[j]=-9999999;
                      break;
                }
              
            }
           
        }
        
    }
}