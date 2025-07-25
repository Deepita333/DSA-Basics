/* Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end = 0;
        int max_length=0;
        HashSet<Character> result= new HashSet<>();
        while(end<s.length())
        {
            char current = s.charAt(end);
            if(!result.contains(current))
            {
                result.add(current);
                max_length= Math.max(max_length,end-start+1);
                end++;
            }
            else
            {
                result.remove(s.charAt(start));
                start++;
            }
          
        }
       return max_length;
    }
}

//https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/7005285/sliding-window-easy-solution-by-ravencla-jhia
