package ds.arrays.matrix;

import java.util.ArrayList;

public class SubtractMatrix {

    public static void main(String[] args) {

        //int [] [] A = {{1,2,3}, {4,5,6}, {7,8,9}};
        //int [] [] B = {{9,8,7}, {6,5,4}, {3,2,1}};

        int [] [] A = {{-5,7}, {3,1}, {4,-10}};
        int [] [] B = {{3,4}, {2,3}, {10,1}};

        int m=A.length;
        int n=A[0].length;
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<m; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++){
                row.add(A[i][j] - B[i][j]);
            }
            resultMatrix.add(row);
        }

        System.out.println(resultMatrix);
    }
}
