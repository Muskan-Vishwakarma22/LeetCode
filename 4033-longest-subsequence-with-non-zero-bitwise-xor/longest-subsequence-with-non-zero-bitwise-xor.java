class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int n = nums.length;
        boolean hasNonZero = false;
        int totalXor = 0;
        for(int num : nums){
            totalXor = totalXor^num;
            if(num!=0){ hasNonZero = true;}
        }
        if(totalXor!=0){
            return n;
        } 
        else if(hasNonZero){
            return n-1;
        }
        else{
            return 0;
        }
    }
}