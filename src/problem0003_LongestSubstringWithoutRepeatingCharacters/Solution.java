package problem0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> charSet = new HashSet<>();

        int length = s.length();
        int max = 0;
        int left = 0;

        for (int right = 0; right < length; right++) {
            if (!charSet.contains(s.charAt(right))) {
                // Expand window: add new character
                charSet.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            } else {
                // Shrink window: remove from left to right until the duplicate is gone
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                // Add current character after clearing duplicates
                charSet.add(s.charAt(right));
            }
        }
        return max;
    }
}
