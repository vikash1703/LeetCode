// String s = "egg";
// String t = "add";
import java.util.HashMap;

public class Isomorphic {
    
    public static boolean isIsomorphic(String s, String t) {
        // If lengths don't match, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to store the character mappings from s -> t and t -> s
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        
        // Iterate through the characters of s and t simultaneously
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check if the current character in s has already been mapped
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;  // Inconsistent mapping from s to t
                }
            } else {
                mapS.put(charS, charT);  // Map s -> t
            }
            
            // Check if the current character in t has already been mapped
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;  // Inconsistent mapping from t to s
                }
            } else {
                mapT.put(charT, charS);  // Map t -> s
            }
        }
        
        return true;  // If no inconsistencies, strings are isomorphic
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));  // Output: true
    }
}
