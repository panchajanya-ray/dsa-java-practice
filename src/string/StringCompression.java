// LeetCode 443. String Compression
// Pattern: Char Array
// Time Complexity: O(N)
// Space Complexity: O(log_{10} N) or O(1)

package string;

public class StringCompression {
	public int compress(char[] chars) {
        int cnt = 1;
        int index = 0;
        for(int i = 1; i < chars.length; i++)
        {
            if(chars[i] == chars[i-1]) cnt++;
            else
            {
                chars[index++]=chars[i-1];
                if(cnt>1)
                {
                    String cntStr=String.valueOf(cnt);
                    for(char c:cntStr.toCharArray()) chars[index++]=c;
                }
                cnt = 1;
            }
        }
        chars[index++]=chars[chars.length-1];
        if(cnt>1)
        {
            String cntStr=String.valueOf(cnt);
            for(char c:cntStr.toCharArray()) chars[index++]=c;
        }

        return index;
    }
}
