// LeetCode Problem: 3664. Two-Letter Card Game
// Time Complexity: O(N + C)
// Space Complexity: O(1)

package arrays;

public class Two_Letter_Card_Game {


}

class Solution2 {
    public int score(String[] cards, char x) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        int both = 0;

        for (String card : cards) {
            if (card.charAt(0) == x && card.charAt(1) == x) {
                both++;
            } else if (card.charAt(0) == x) {
                cnt1[card.charAt(1) - 'a']++;
            } else if (card.charAt(1) == x) {
                cnt2[card.charAt(0) - 'a']++;
            }
        }

        int answer = 0;

        for (int i = 0; i <= both; i++) {
            int group1 = solve(cnt1, i);
            int group2 = solve(cnt2, both - i);
            answer = Math.max(answer, group1 + group2);
        }

        return answer;
    }

    private static int solve(int[] cnt, int have) {

        int total = have;
        int maxFreq = have;

        for (int c : cnt) {
            total += c;
            maxFreq = Math.max(maxFreq, c);
        }

        return Math.min(total / 2, total - maxFreq);
    }
}
