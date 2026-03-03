// LeetCode Problem: 242. Valid Anagram
// Time Complexity: O(n), O(n^2) if hash crashes {rare}
// Space Complexity: O(1)

package hashMap;

// import java.util.HashMap;

public class ValidAnagram {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        /*
	        if(s.length()==t.length())
	        {
	            HashMap <Character, Integer> count = new HashMap<>();
	            for(char ch: s.toCharArray())
	            {
	                if(count.containsKey(ch)) count.replace(ch, count.get(ch)+1);
	                else count.put(ch, 1);
	            }
	        
	            for(char ch: t.toCharArray())
	            {
	        	    if(!count.containsKey(ch) || count.get(ch)==0) return false;
	                else count.replace(ch, count.get(ch)-1);
	            }
	            return true;
	        }
	        return false;
	        */
	    	
	        if(s.length()!=t.length()) return false;
	        int[] count = new int[26];
	        for(int i=0;i<s.length();i++)
	        {
	            count[s.charAt(i) - 'a']++;
	            count[t.charAt(i) - 'a']--;
	        }
	        for(int val: count)
	        {
	            if(val!=0) return false;
	        }
	        return true;
	    }
	}
}
