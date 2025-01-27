# 682 - Baseball Game
Date: 2025-01-27
**Link**: [LeetCode Problem 682](https://leetcode.com/problems/baseball-game/description/) 
**Difficulty**: #Easy  
**Topics:** [[Array]], [[Stack]]

---
## Description

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings `operations`, where `operations[i]` is the `ith` operation you must apply to the record and is one of the following:

- An integer `x`.
    - Record a new score of `x`.
- `'+'`.
    - Record a new score that is the sum of the previous two scores.
- `'D'`.
    - Record a new score that is the double of the previous score.
- `'C'`.
    - Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a **32-bit** integer and that all operations are valid.

---
## Examples

**Example 1:**
- **Input:** ops = ["5","2","C","D","+"]
- **Output:** 30
- **Explanation:**
	"5" - Add 5 to the record, record is now [5].
	"2" - Add 2 to the record, record is now [5, 2].
	"C" - Invalidate and remove the previous score, record is now [5].
	"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
	"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
	The total sum is 5 + 10 + 15 = 30.

**Example 2:**
- **Input:** ops = ["5","-2","4","C","D","9","+","+"]
- **Output:** 27
- **Explanation:**
	"5" - Add 5 to the record, record is now [5].
	"-2" - Add -2 to the record, record is now [5, -2].
	"4" - Add 4 to the record, record is now [5, -2, 4].
	"C" - Invalidate and remove the previous score, record is now [5, -2].
	"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
	"9" - Add 9 to the record, record is now [5, -2, -4, 9].
	"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
	"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
	The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.

**Example 3:**
- **Input:** ops = ["1","C"]
- **Output:** 0
- **Explanation:**
	"1" - Add 1 to the record, record is now [1].
	"C" - Invalidate and remove the previous score, record is now [].
	Since the record is empty, the total sum is 0.

---
## Solution Approach

### Key Idea
Use a `Stack` to track scores dynamically. For each operation:  
- `Integer` Push it onto the stack and add to the total sum.  
- **`'+'`**: Sum the top two elements, push the result, and update the sum.  
- **`'D'`**: Double the top element, push it, and update the sum.  
- **`'C'`**: Remove the top element and subtract it from the sum.

### Steps  
1. Initialize a stack to store scores.  
2. Track the total sum (`result`) incrementally to avoid recalculating at the end.  
3. Process each operation:  
   - For `'+'`, calculate the sum of the last two scores.  
   - For `'D'`, compute double the last score.  
   - For `'C'`, remove the last score and adjust the total.  
   - For integers, convert to `int` and add to the stack.