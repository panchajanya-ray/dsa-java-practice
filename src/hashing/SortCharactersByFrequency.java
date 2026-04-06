// LeetCode 451. Sort Characters By Frequency
// Pattern: HashMap, Lambda function Sort
// Time Complexity: O(n + klogk)
// Space Complexity: O(n)

package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) 
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for(char c : list) 
        {
            int count = map.get(c);
            for(int i = 0; i < count; i++) 
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
