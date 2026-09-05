class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        prefixMax[0] = nums[0];
        suffixMin[n-1] = nums[n-1];
        for(int i = 1; i<n; i++){
            prefixMax[i]= Math.max(prefixMax[i-1],nums[i]);
        }
        for(int j = n-2; j>=0; j--){
            suffixMin[j] = Math.min(nums[j],suffixMin[j+1]);
        }
        for(int i = 0; i<n; i++){
            if(prefixMax[i]-suffixMin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}