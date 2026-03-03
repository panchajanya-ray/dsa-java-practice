// LeetCode Problem: 387. First Unique Character in a String
// Time Complexity: O(n)
// Space Complexity: O(1)

package hashing;

// import java.util.HashMap;

public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
        /*
        HashMap <Character, Integer> charFreq = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            if(charFreq.containsKey(ch)) charFreq.replace(ch, charFreq.get(ch)+1);
            else charFreq.put(ch,1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(charFreq.get(s.charAt(i))==1) return i;
        }
        return -1;
        */

        int[] freq= new int[26];

        for(int i= 0; i< s.length(); i++)
        {
            char ch= s.charAt(i);
            freq[ch - 'a'] +=1;
        }

        for(int i= 0; i< s.length(); i++)
        {
            char ch= s.charAt(i);
            if(freq[ch-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}
