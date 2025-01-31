# 3 - Longest Substring Without Repeating Characters
Date: 2025-01-31
**Link**: [LeetCode Problem 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/) 
**Difficulty**: #Medium  
**Topics:** [[Hash Table]], [[String]], [[Sliding Window]]

---
## Description

Given a string `s`, find the length of the **longest substring** without repeating characters.

---
## Examples

**Example 1:**
- **Input:** s = "abcabcbb"
- **Output:** 3
- **Explanation:** The answer is "abc", with the length of 3.

**Example 2:**
- **Input:** s = "bbbbb"
- **Output:** 1
- **Explanation:** The answer is "b", with the length of 1.

**Example 3:**
- **Input:** s = "pwwkew"
- **Output:** 3
- **Explanation:** The answer is "wke", with the length of 3.

Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

---
## Solution Approach

### Key Idea
- Use a `HashSet` to track unique characters in the window.
- Maintain a window `[left, right]` representing the current substring.
- Iterate through the string: 
1. If the current character is not in the set, add it. If the current window size is larger, update the max.
2. If the character is already in the set, iterates through the set from the left to the right, removing the characters until the repeated one is no longer in it. 

---

