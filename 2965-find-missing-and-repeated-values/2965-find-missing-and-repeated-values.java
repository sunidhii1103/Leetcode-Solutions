import java.util.*;

class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> set = new HashSet<>();

        int n = grid.length;

        int repeated = 0;
        int missing = 0;

        int exp_sum;
        int act_sum = 0;


        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                act_sum += grid[i][j];

                if(set.contains(grid[i][j])) {

                    repeated = grid[i][j];
                }

                set.add(grid[i][j]);
            }
        }


        int total = n * n;

        exp_sum = total * (total + 1) / 2;

        missing = exp_sum + repeated - act_sum;


        return new int[]{
            repeated,
            missing
        };
    }
}