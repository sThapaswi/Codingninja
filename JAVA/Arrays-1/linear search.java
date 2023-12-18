
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
    boolean f=false;
    int i;
    for( i=0; i<arr.length;i++){
      if(arr[i]==x){
        f = true;
        break;
      }

    }
    if (f==false){
            return -1;
        }
        else {
            return i;
        }
    
    }
}