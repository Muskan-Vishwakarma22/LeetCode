class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int m = reservedSeats.length;

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        // Store reserved seats row-wise
        for (int i = 0; i < m; i++) {
            int row = reservedSeats[i][0];
            int seat = reservedSeats[i][1];

            map.putIfAbsent(row, new HashSet<>());
            map.get(row).add(seat);
        }

        // Rows with no reservations can fit 2 families
        int answer = (n - map.size()) * 2;

        // Check rows that contain reservations
        for (HashSet<Integer> seats : map.values()) {

            boolean left = true;
            for (int i = 2; i <= 5; i++) {
                if (seats.contains(i)) {
                    left = false;
                    break;
                }
            }

            boolean middle = true;
            for (int i = 4; i <= 7; i++) {
                if (seats.contains(i)) {
                    middle = false;
                    break;
                }
            }

            boolean right = true;
            for (int i = 6; i <= 9; i++) {
                if (seats.contains(i)) {
                    right = false;
                    break;
                }
            }

            // Both non-overlapping groups are available
            if (left && right) {
                answer += 2;
            }
            // At least one group is available
            else if (left || middle || right) {
                answer++;
            }
        }

        return answer;
    }
}