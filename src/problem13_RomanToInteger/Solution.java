package problem13_RomanToInteger;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        // Predefined mappings for Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int length = s.length();
        // Edge case: single character input
        if (length < 2) {
            return romanValues.get(s.charAt(0));
        }
        // Iterate until the second to last character to avoid index overflow
        for (int i = 0; i < length - 1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            // Check for subtractive combinations like IV
            if (romanValues.get(currentChar) < romanValues.get(nextChar)) {
                int subtractiveValue = romanValues.get(nextChar) - romanValues.get(currentChar);
                total += subtractiveValue;
                i++;  // Skip the next character because it was already processed
            } else {
                total += romanValues.get(currentChar);
            }
        }
        // Handle the last character if it isn't part of a subtractive pair
        char secondToLastChar = s.charAt(length - 2);
        char lastChar = s.charAt(length - 1);
        if (romanValues.get(secondToLastChar) >= romanValues.get(lastChar)) {
            total += romanValues.get(lastChar);
        }
        return total;
    }
}
