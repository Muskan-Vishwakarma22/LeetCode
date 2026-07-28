class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int totalSum = nums[0];
        int currentSum = nums[0];
        int maxSum = nums[0];
        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < n; i++) {
            //Maximum Sum using Kadane's Algo
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
            //Minimum Subarray using Kadane's Algo
            currentMin = Math.min(currentMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currentMin);
            //Total sum of the array elements
            totalSum += nums[i];
        }
        //Edge case where Kadane's approach does not work
        if (maxSum < 0) {
            return maxSum;
        }
        //Return Statement
        return Math.max(maxSum, totalSum - minSum);
    }
}