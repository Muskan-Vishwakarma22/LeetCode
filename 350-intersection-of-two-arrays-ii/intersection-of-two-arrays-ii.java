import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numbers = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        // Initialize an ArrayList with elements
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    numbers[k++] = nums1[i];
                    nums2[j] = -1;   // mark as used
                    break;
                }
            }
        }
        int[] ans = new int[k];
        for(int m = 0; m < k;m++) {
            ans[m] = numbers[m];
        }
    return ans;
    }
}