// LeetCode 49. Group Anagrams
// Pattern: HashMap
// Time Complexity: O(n * klog k)
// Space Complexity: O(nk)

package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] chars = word.toCharArray();

            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
