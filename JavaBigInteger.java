import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        BigInteger b1, b2, sum, multi;
        
        b1 = new BigInteger(in.next());
        b2 = new BigInteger(in.next());
        
        sum = b1.add(b2);
        multi = b1.multiply(b2);
        
        
        System.out.println(sum + "\n" + multi);
    }
}
