class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int minOdd = Integer.MAX_VALUE;
        // Find the smallest odd number
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 != 0) {
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }
        // No odd numbers : already uniform
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        // An even number smaller than minOdd cannot become odd
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0 && nums1[i] < minOdd) {
                return false;
            }
        }
        return true;
    }
}