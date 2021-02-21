import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here
        s = s.replaceAll("[!,?._'@]", " ");
        s = s.trim().replaceAll(" +", " ");
        
        if (s.length() != 0) {
            String[] spl = s.split(" ");
            System.out.println(spl.length);
            
            for (String a : spl) {
                System.out.println(a);
            }
        } else {
            System.out.println(s.length());
        }

        scan.close();
    }
}

