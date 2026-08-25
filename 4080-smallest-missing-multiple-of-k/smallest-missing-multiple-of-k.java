class Solution {
    public int missingMultiple(int[] nums, int k) {
        //Hash set tp contain the values of nums and cross check with multiples
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
        }

        for (int i = 1; ; i++) {
            int multiple = k * i;
            //the first multiple of k that is not present in nums is returned]
            if (!set.contains(multiple)) {
                return multiple;
            }
        }
    }
}