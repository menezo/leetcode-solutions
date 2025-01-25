package problem409;

import java.util.HashSet;

public class Solution {

    private static int findLongestPalindrome(String s) {

        HashSet<Character> letters = new HashSet<>();

        int count = 0;

        for(Character ch : s.toCharArray()) {
            if(!letters.contains(ch)) {
                letters.add(ch);
            } else {
                letters.remove(ch);
                count += 2;
            }
        }
        if(!letters.isEmpty()) {
            count++;
        }
        return count;
    }
}
