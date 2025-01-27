# 20 - Valid Parentheses
Date: 2025-01-27
**Link**: [LeetCode Problem 20](https://leetcode.com/problems/valid-parentheses/) 
**Difficulty**: #Easy  
**Topics:** [[String]] [[Stack]]

---
## Description

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

---
## Examples

- **Example 1:**
	- **Input:** s = "()"
	- **Output:** true

- **Example 2:**
	- **Input:** s = "()[]{}"
	- **Output:** true

- **Example 3:**
	- **Input:** s = "(]"
	- **Output:** false

- **Example 4:**
	- **Input:** s = "([])"
	- **Output:** true

---
## Solution Approach

### Key Idea
Use a `Stack` to track open brackets. The stack ensures that the most recent open bracket is matched first:
1. Iterate through the string:
	- Open brackets: Push onto the stack.  
	- Close brackets: Check if the top of the stack contains the corresponding open bracket.
2. Early termination: 
	- If a mismatch occurs or the stack is empty when a close bracket appears, return `false`.
3. Final check: 
	- After processing all characters, the stack must be empty for the string to be valid.

