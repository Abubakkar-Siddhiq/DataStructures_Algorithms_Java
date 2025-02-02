# Understanding Permutations using Recursive Backtracking
```
Leetcode 46: Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order. 
Input: nums = [1,2,3]
Output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
```

Since we're using recursive backtracking here. The first thing we should think of is the `Base Case`. Before that,

1. We'll be using variable `level` to keep track of how deep we are in our recursion tree.
    * Think of it like levels in a building, we start from ground floor (0) and go up
    * Each level represents fixing one position in our array

2. We Start at `Level 0` and end at `array.length-1` which is our `base-case`.
    * Example: For array [1,2,3]
    * Start: Level 0 (ground floor)
    * End/Base case: Level 2 (array.length-1)

3. And, We'll loop through the `array` from `level` to `array.length`.
    * At Level 0: try all positions (0,1,2)
    * At Level 1: try remaining positions (1,2)
    * At Level 2: only one position left!

4. On each iteration, We `swap` the `array` in-place with level & i (loop's iteration variable).
    * `Eg: swap(level, i)`
    * This is like trying different numbers at current position
    * We modify array in-place (no extra space!)

5. Next, We recursively call our function with an increment in the level.
    * `Eg: backtrack(.., level+1, ..)`
    * Like saying "okay, fixed this position, let's move to next"

6. Now the backtracking part! Since we went till `level 0 -> 2`, We reached this line of the loop.
    * We need to restore array state
    * Why? So we can try next possibility
    * This is the "backtracking" in recursive backtracking!

7. Okay, But where are we storing the results?!
    * We need a collection to store all valid permutations
    * Pass `result` (List of Lists) through all recursive calls
    * It's like a basket collecting all our permutations

8. And we add the array we get in the `base-case` to the result.
    * When we reach last level, current array state is a valid permutation
    * Add it to our results collection
    * Then backtrack to find more!

Time Complexity: O(n!)
Space Complexity: O(n) - recursion depth

Remember: Think of it like trying different combinations on a lock - try one, if it doesn't work, undo it and try another!

## Visual Representation
