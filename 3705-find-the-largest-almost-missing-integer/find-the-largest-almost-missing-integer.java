class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        //if window size is same as the arrau then we just need to find the max no 
        if (k == n) {
            return max(nums);
        }
        //Declaring hashmap for storing frequency
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Build frequency map
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        // k == 1: largest element occurring exactly once
        if (k == 1) {
            int ans = -1;

            for (int key : freq.keySet()) {
                if (freq.get(key) == 1) {
                    ans = Math.max(ans, key);
                }
            }

            return ans;
        }

        // 1 < k < n: only first and last elements can qualify
        int ans = -1;

        if (freq.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }

    private int max(int[] nums) {
        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }
}