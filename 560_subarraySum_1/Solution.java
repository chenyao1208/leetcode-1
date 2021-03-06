/*
LeetCode Problem No.560:    https://leetcode.com/problems/subarray-sum-equals-k/
Author:                     zhangyixing1007
Idea:                       brute force
Time:                       150 ms, beat 40.08%
Space:                      38.3 MB, beat 93.52%
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1) return nums[0] == k? 1:0;
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        int ans = 0;       
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == k) ans++;
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] - nums[i] == k) ans++;
            }
        }
        if (nums[nums.length-1] == k) ans++;
        return ans;
    }
}
