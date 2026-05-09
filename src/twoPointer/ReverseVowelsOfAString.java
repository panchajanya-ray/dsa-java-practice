// LeetCode 345. Reverse Vowels of a String
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(n)

package twoPointer;

public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
        char sArr[] = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            while(left < right && "aeiouAEIOU".indexOf(sArr[left]) == -1) left++;
            while(left < right && "aeiouAEIOU".indexOf(sArr[right]) == -1) right--;
            char temp = sArr[left];
            if(left >= right) break;
            sArr[left] = sArr[right];
            sArr[right] = temp;
            left++;
            right--;
        }
        return new String(sArr);
    }
}
