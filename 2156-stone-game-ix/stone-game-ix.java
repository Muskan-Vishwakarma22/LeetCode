class Solution {
    public boolean stoneGameIX(int[] stones) {

        int[] remCount = new int[3];

        for (int nums : stones) {
            remCount[nums % 3]++;
        }

        int c0 = remCount[0];
        int c1 = remCount[1];
        int c2 = remCount[2];

        if (c0 % 2 == 0) {
            return c1 > 0 && c2 > 0;
        } 
        else {
            return Math.abs(c1 - c2) > 2;
        }
    }
}