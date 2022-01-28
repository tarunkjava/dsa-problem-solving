package ds.arrays.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RotateNintyDegree {

    public static void main(String[] args) {
        int m[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<ArrayList<Integer>> solve = solve(m);
        System.out.println(solve);
    }

    public static ArrayList<ArrayList<Integer>> solve(int[][] A) {
        int m = A.length, n = A[0].length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0, k = n - 1; j < n / 2; j++,k--) {
                int temp = A[i][k];
                A[i][k] = A[i][j];
                A[i][j] = temp;
            }
        }


        for(int i=0; i<m; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<m;j++){
                row.add(A[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}