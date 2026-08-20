import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));

        for (int rank = 0; rank < n; rank++) {
            if (rank == 0) {
                result[indices[rank]] = "Gold Medal";
            } else if (rank == 1) {
                result[indices[rank]] = "Silver Medal";
            } else if (rank == 2) {
                result[indices[rank]] = "Bronze Medal";
            } else {
                result[indices[rank]] = String.valueOf(rank + 1);
            }
        }

        return result;
    }
}
