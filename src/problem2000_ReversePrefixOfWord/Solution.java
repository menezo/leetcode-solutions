package problem2000_ReversePrefixOfWord;

public class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();
        // Find the first occurrence of 'ch' in the string
        int pos = word.indexOf(ch);
        // If 'ch' is not found, return the original string
        if(pos == -1) {
            return word;
        }
        // Reverse the segment from index 0 to pos (inclusive)
        for(int i = pos; i >= 0 ; i--){
            result.append(word.charAt(i));
        }
        // Append the remaining characters after 'pos'
        result.append(word.subSequence(pos + 1, word.length()));
        return result.toString();
    }
}