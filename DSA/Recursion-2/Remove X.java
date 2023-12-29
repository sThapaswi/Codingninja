
public class solution {
	static String rem(String in){
		if(in.length()==0){
			return in;
		}
		char f = in.charAt(0);
		String r = rem(in.substring(1));
		if(f=='x'){
			return r;
		}else{
			return Character.toString(f)+r;
		}
	}

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        return rem(input);
	}
}
