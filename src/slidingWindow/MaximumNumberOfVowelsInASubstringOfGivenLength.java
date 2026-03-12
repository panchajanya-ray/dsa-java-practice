// LeetCode 1456. Maximum Number of Vowels in a Substring of Given Length
// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

package slidingWindow;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
	public int maxVowels(String s, int k) {
        int maxVowel;
        int countVowel=0;
        //List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int left  = 0;
        int right;
        for(right=0;right<k;right++) 
        {
            char ch = s.charAt(right);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') countVowel++;
        }

        maxVowel = countVowel;
        for(right=k;right<s.length();right++)
        {
            int ch = s.charAt(left);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') countVowel--;
            left++;

            ch = s.charAt(right);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') countVowel++;

            maxVowel = Math.max(maxVowel, countVowel);
        }
        return maxVowel;
    }
}
