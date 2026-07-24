class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int split = n-k;
        int max=nums.length;
        int left = split;
        int right=n-1;
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        left = 0;
        right = split-1;
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=max-1;
            while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}