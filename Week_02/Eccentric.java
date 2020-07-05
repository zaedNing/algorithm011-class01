

import java.util.HashMap;
import java.util.Map;


public class Eccentric {

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> mapS = new HashMap<>();
            Map<Character, Integer> mapT = new HashMap<>();
            for (char a : s.toCharArray()) {
                mapS.put(a, mapS.getOrDefault(a, 0) + 1);
            }
            for (char b : t.toCharArray()) {
                mapT.put(b, mapT.getOrDefault(b, 0) + 1);
            }

            for (char a : s.toCharArray()) {
                if (!mapS.get(a).equals(mapT.get(a))) {
                    return false;
                }
            }
            return true;
        }
    }
}