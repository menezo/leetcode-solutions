package problem409;

import java.util.HashSet;

public class Solution {

    private static int findLongestPalindrome(String s) {
        //HashSet to track the characters without pairs
        HashSet<Character> letters = new HashSet<>();

        int count = 0;

        for(Character ch : s.toCharArray()) {
            //If the character is unmatched, adds it to the set. Otherwise, it's a pair, so remove it from the set and count the pair in the length
            if(!letters.contains(ch)) {
                letters.add(ch);
            } else {
                letters.remove(ch);
                count += 2;
            }
        }
        //Verify if there's still any unmatched character on the set, if so it can be used as the center
        if(!letters.isEmpty()) {
            count++;
        }
        return count;
    }
}
