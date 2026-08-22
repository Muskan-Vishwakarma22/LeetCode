class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int prod = 1;

        while (n != 0) {
            int unit = n % 10;
            n = n / 10;

            sum += unit;
            prod *= unit;
        }

        int total = sum + prod;

        return original % total == 0;
    }
}