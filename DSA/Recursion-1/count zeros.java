
public class solution {
	static int count(int in, int is){
		String s = Integer.toString(in);
		int n = s.length();
		
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='0'){
                is++;
			}
		}
		return is;
	}

	public static int countZerosRec(int input){
		// Write your code here
		return count(input,0);

	}
}
