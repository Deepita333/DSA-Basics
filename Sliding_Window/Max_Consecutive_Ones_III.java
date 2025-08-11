/* Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined. */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0; // left pointer of the sliding window
        int c = 0;     // count of zeros in the window
        int ml = 0;    // max length

        for (int end = 0; end < nums.length; end++) {
            // if we find a zero, increase zero count
            if (nums[end] == 0) {
                c++;
            }

            // shrink window until number of zeros <= k
            while (c > k) {
                if (nums[start] == 0) {
                    c--;
                }
                start++;
            }

            // update max length
            ml = Math.max(ml, end - start + 1);
        }

        return ml;
    }
}

/* https://leetcode.com/problems/max-consecutive-ones-iii/solutions/7069341/two-pointers-solution-by-ravenclaw123-atqd */
 
