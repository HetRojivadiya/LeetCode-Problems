import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> m = new HashMap<>();
        HashSet<String> h = new HashSet<>();
        
        String[] str = s.split(" ");
        
        if (pattern.length() != str.length) {
            return false; 
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentStr = str[i];
            
            if (m.containsKey(currentChar)) {
                if (!m.get(currentChar).equals(currentStr)) {
                    return false;
                }
            } else {
                if (h.contains(currentStr)) {
                    return false;
                }
                m.put(currentChar, currentStr);
                h.add(currentStr);
            }
        }
        
        return true;
    }
}
