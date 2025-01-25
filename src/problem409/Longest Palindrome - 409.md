**Link**: [LeetCode Problem 409](https://leetcode.com/problems/longest-palindrome/description/)
**Difficulty**: #Easy  
**Topics:** #HashTable #String #Greedy
## Description

Given a string `s` which consists of lowercase or uppercase letters, return the length of the **longest palindrome** that can be built with those letters.
Letters are **case sensitive**, for example, `"Aa"` is not considered a palindrome.

## Examples
### Example 1:
**Input:** s = "abccccdd"
**Output:** 7
**Explanation:** One longest palindrome that can be built is "dccaccd", whose length is 7.

### Example 2:
**Input:** s = "a"
**Output:** 1
**Explanation:** The longest palindrome that can be built is "a", whose length is 1.


## Solution Approach

### Key Idea
Use a `HashSet` to track character pairs:
1. Iterate through the string:
    - If a character is already in the set, remove it and add `2` to the palindrome length counter (this forms a pair).
    - If not, add the character to the set.
2. If the set is not empty at the end, add `1` to the counter (a single character can be placed in the center of the palindrome).