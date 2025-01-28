# 2000 - Reverse Prefix of Word
Date: 2025-01-28
**Link**: [LeetCode Problem 2000](https://leetcode.com/problems/reverse-prefix-of-word/description/) 
**Difficulty**: #Easy  
**Topics:** [[Two Pointers]], [[String]], [[Stack]]

---
## Description

Given a **0-indexed** string `word` and a character `ch`, **reverse** the segment of `word` that starts at index `0` and ends at the index of the **first occurrence** of `ch` (**inclusive**). If the character `ch` does not exist in `word`, do nothing.
- For example, if `word = "abcdefd"` and `ch = "d"`, then you should **reverse** the segment that starts at `0` and ends at `3` (**inclusive**). The resulting string will be `"dcbaefd"`.
Return _the resulting string_.

---
## Examples
**Example 1:**
- **Input:** word = "abcdefd", ch = "d"
- **Output:** "dcbaefd"
- **Explanation:** The first occurrence of "d" is at index 3. 
	- Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
	- 
**Example 2:**
- **Input:** word = "xyxzxe", ch = "z"
- **Output:** "zxyxxe"
- **Explanation:** The first and only occurrence of "z" is at index 3.
	- Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".

**Example 3:**
- **Input:** word = "abcd", ch = "z"
- **Output:** "abcd"
- **Explanation:** "z" does not exist in word.
	- You should not do any reverse operation, the resulting string is "abcd".

---
## Solution Approach

### Key Idea
- Locate the first occurrence of `ch` in `word`. If not found, return `word`.
- Reverse the substring from index `0` to `pos` (inclusive).
- Append the remaining characters (after `pos`) unchanged:
1. Find the index (`pos`) of the first occurrence of `ch` using `indexOf`.
2. If `pos` is `-1`, return the original string.
3. Reverse the segment from `0` to `pos` by iterating backward and appending characters to a `StringBuilder`.
4. Append the rest of the string starting from `pos + 1`.
---
