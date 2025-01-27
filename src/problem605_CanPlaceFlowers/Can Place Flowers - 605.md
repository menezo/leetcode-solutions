# 605 - Can Place Flowers
**Link**: [LeetCode Problem 605](https://leetcode.com/problems/can-place-flowers/description/) 
**Difficulty**: #Easy  
**Topics:** #Array #Greedy
[[LeetCode]]
## Description

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in **adjacent** plots.

Given an integer array `flowerbed` containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return `true` _if_ `n` _new flowers can be planted in the_ `flowerbed` _without violating the no-adjacent-flowers rule and_ `false` _otherwise_.

## Examples
### Example 1:
**Input:** flowerbed = [1,0,0,0,1], n = 1
**Output:** true

### Example 2:
**Input:** flowerbed = [1,0,0,0,1], n = 2
**Output:** false


## Solution Approach

### Key Idea
1. **Iterate through the flowerbed** and plant flowers as early as possible.
2. **Check three conditions** for each plot `i`:
    - The current plot is empty (`flowerbed[i] == 0`).
    - The left neighbor is empty **or** it’s the first plot (`i == 0`).
    - The right neighbor is empty **or** it’s the last plot (`i == flowerbed.length - 1`).

