class Solution {
    public int digitProduct(int n) {
        int product = 1;
        while (n != 0) {
            int last = n % 10;
            n = n / 10;
            product *= last;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n)%t==0) {
                return n;
            }
            n++;
    }
}
}