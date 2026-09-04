class Solution {
    public int firstStableIndex(int[] nums, int k) {
          for (int i = 0; i < nums.length; i++) {
            int leftMax = Integer.MIN_VALUE;
            int rightMin = Integer.MAX_VALUE;
            // Find maximum from 0 to i
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, nums[j]);
            }
            // Find minimum from i to n-1
            for (int j = i; j < nums.length; j++) {
                rightMin = Math.min(rightMin, nums[j]);
            }
            // Check if i is stable
            if (leftMax - rightMin <= k) {
                return i;
            }
        }
        return -1;
    }
}