# 1- Two Sum
Date: 2025-01-29
**Link**: [LeetCode Problem 1](https://leetcode.com/problems/two-sum/description/) 
**Difficulty**: #Easy  
**Topics:** [[Array]], [[Hash Table]]
[[LeetCode]]

---
## Description

Given an array of integers `nums` and an integer `target`, return _indices of the two numbers such that they add up to `target`_.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

---
## Examples

**Example 1:**
- **Input:** nums = [2,7,11,15], target = 9
- **Output:** [0,1]
- **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**
- **Input:** nums = [3,2,4], target = 6
- **Output:** [1,2]

**Example 3:**
- **Input:** nums = [3,3], target = 6
- **Output:** [0,1]

---
## Solution Approach

### Key Idea
- Use a hash map to track each number's index for O(1) complement checks.
- Iterate through the array. For each number:
    - Calculate its complement (`target - num`).
    - If the complement exists in the map, return the current index and the complement's index.
    - Otherwise, add the current number and its index to the map to avoid reuse.
- By checking for the complement **before** adding the current number to the map, we ensure the same element isn't used twice.
---