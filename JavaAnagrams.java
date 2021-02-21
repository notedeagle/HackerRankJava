import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        } 
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char letter : charA) {
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer freq = map.get(letter);
                map.put(letter, ++freq);
            }
        }
        
        for (char letter : charB){
            if (!map.containsKey(letter)) {
                return false;
            }
            
            Integer freq = map.get(letter);

            if(freq == 0) {
                return false;
            } else {
                map.put(letter, --freq);
            } 
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
