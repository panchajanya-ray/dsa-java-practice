// LeetCode 205. Isomorphic Strings
// Pattern: HashMap
// Time Complexity: O(n^2)
// Space Complexity: O(n)

package hashing;

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            
                if((hm.containsKey(s.charAt(i))) && (hm.get(s.charAt(i))!=t.charAt(i))) return false;
                else if((hm.containsValue(t.charAt(i))) && (!hm.containsKey(s.charAt(i)))) return false;
                hm.put(s.charAt(i),t.charAt(i));
            
        }
        return true;
    }
}
