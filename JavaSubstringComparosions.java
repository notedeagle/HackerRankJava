import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i = 0; i <= s.length()-k; i++) {
            String sub = s.substring(i, k + i);
            if (largest.compareTo(sub) < 0) {
                largest = sub;
            } 
            if (smallest.compareTo(sub) > 0) {
                smallest = sub;
            }
        }
        
        return smallest + "\n" + largest;
    }

