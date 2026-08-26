class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        ArrayList<Integer> ones = new ArrayList<>();

        // Store positions of all 1s
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones.add(i);
            }
        }

        // Not enough 1s
        if (ones.size() < k) {
            return "";
        }
        String best = "";

        // Consider every group of k consecutive 1s
        for (int i = 0; i + k - 1 < ones.size(); i++) {
            int start = ones.get(i);
            int end = ones.get(i + k - 1);
            String current = s.substring(start, end + 1);

            // Choose shorter, or lexicographically smaller if tied
            if (best.equals("") ||
                current.length() < best.length() ||
                (current.length() == best.length()
                 && current.compareTo(best) < 0)) {
                best = current;
            }
        }
        return best;
    }
}