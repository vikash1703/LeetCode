import java.util.*;
class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to group anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        // Iterate over the input strings
        for (String str : strs) {
            // Convert the string into a char array, sort it and convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Add the original string to the corresponding list in the map
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);
        }
        
        // Return the values of the map as the result
        return new ArrayList<>(anagramMap.values());
    }
        public static void main(String[] args) {
        	GroupAnagram solution = new GroupAnagram();
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> result = solution.groupAnagrams(strs);
            
            System.out.println(result);
        }
    }
