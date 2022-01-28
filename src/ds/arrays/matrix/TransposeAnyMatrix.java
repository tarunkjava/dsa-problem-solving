package ds.arrays.matrix;

import java.util.ArrayList;

public class TransposeAnyMatrix {

    public static void main(String[] args) {
        int m[][] = {{1, 2, 3,0}, {4, 5, 6,0}, {7, 8, 9,0}};

        ArrayList<ArrayList<Integer>> solve = solve(m);
        System.out.println(solve);
    }

    public static ArrayList<ArrayList<Integer>> solve(int[][] A) {
        int m = A.length, n = A[0].length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(A[j][i]);
            }
            result.add(row);
        }
        return result;
    }
}
