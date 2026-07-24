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
        for(int i=0; i<split;i++){
            int temp = nums[i];
            nums[i]=nums[split-1];
            nums[split-1]=temp;
            split--;
        }
        for(int i=0;i<max/2;i++){
            int temp = nums[i];
            nums[i]=nums[max-i-1];
            nums[max-i-1] = temp;
        }
    }
}