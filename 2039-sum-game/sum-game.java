class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int leftsum = 0;
        int rightsum = 0;
        int leftques = 0;
        int rightques = 0;

        for (int i = 0; i < n / 2; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                leftques++;
            } else {
                int digit = ch - '0';
                leftsum += digit;
            }
        }

        for (int i = n / 2; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                rightques++;
            } else {
                int digit = ch - '0';
                rightsum += digit;
            }
        }

        // Odd number of ? → Alice wins
        if ((leftques + rightques) % 2 != 0) {
            return true;
        }

        int diff = leftsum - rightsum;
        int qdiff = leftques - rightques;

        // Bob wins if he can exactly compensate for the difference
        return diff != -(qdiff / 2) * 9;
    }
}