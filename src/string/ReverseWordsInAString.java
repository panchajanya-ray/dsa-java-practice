// LeetCode 151. Reverse Words in a String
// Pattern: String manipulation
// Time Complexity: O(n)
// Space Complexity: O(n)

package string;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        StringBuilder res = new StringBuilder();
        
        for(int i = words.length - 1; i >= 0; i--){
            res.append(words[i]);
            
            if(i != 0){
                res.append(" ");
            }
        }
        
        return res.toString();

        /*
        String res = "";
        int i = s.length()-1;

        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ') i--;

            if(i<0) break;
            
            int j = i;
            while(j >= 0 && s.charAt(j) != ' ') j--;

            if(res.length() == 0) res += s.substring(j+1, i+1);
            else res += ' ' + s.substring(j+1, i+1);

            i = j -1;
        }

        return res;
        */
    }
}
