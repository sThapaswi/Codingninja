import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String binaryStr = s.next();
        
        // Parse the binary string to an integer using Integer.parseInt
        int decimal = Integer.parseInt(binaryStr, 2);

        System.out.println(decimal);
    }
}
