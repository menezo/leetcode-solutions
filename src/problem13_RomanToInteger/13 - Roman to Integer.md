# 13 - Roman to Integer
Date: 2025-01-29
**Link**: [LeetCode Problem 13](https://leetcode.com/problems/roman-to-integer/description/) 
**Difficulty**: #Easy  
**Topics:** [[Hash Table]], [[String]]
[[LeetCode]]

---
## Description

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

**Symbol**       **Value**
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

- `I` can be placed before `V` (5) and `X` (10) to make 4 and 9. 
- `X` can be placed before `L` (50) and `C` (100) to make 40 and 90. 
- `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

---
## Examples

**Example 1:**
- **Input:** s = "III"
- **Output:** 3
- **Explanation:** III = 3.

**Example 2:**
- **Input:** s = "LVIII"
- **Output:** 58
- **Explanation:** L = 50, V= 5, III = 3.

**Example 3:**
- **Input:** s = "MCMXCIV"
- **Output:** 1994
- **Explanation:** M = 1000, CM = 900, XC = 90 and IV = 4.

---
## Solution Approach

### Key Idea
- Use a **HashMap** to store Roman-to-integer mappings.
- Iterate through the string:
    1. Check if the **current character** represents a value smaller than the **next character** (indicating a subtractive pair like `IV` or `IX`).
    2. If so, subtract the current value from the next value, add the result to the total, and skip the next character.
    3. Otherwise, simply add the current character's value to the total.
- Handle the **last character separately** if it wasn't part of a subtractive pair.

---