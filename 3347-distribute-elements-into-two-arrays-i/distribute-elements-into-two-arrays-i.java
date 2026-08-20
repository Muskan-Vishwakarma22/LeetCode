class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[0] = nums[0];
        int count1 = 1;
        arr2[0] = nums[1];
        int count2=1;
        for (int i = 2; i < n; i++) {
            if(arr1[count1 - 1] > arr2[count2 - 1]){
                arr1[count1]=nums[i];
                count1++;
            }
            else{
                arr2[count2]=nums[i];
                count2++;
            }
        }
        int r = 0;
        while(r<count2){
            arr1[count1] = arr2[r];
            count1++;
            r++;
        }
        return arr1;
    }

}