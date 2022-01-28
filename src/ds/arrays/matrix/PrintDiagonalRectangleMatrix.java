package ds.arrays.matrix;

import java.util.ArrayList;

public class PrintDiagonalRectangleMatrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        int m=arr.length;
        int n=arr[0].length;

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<ArrayList<Integer>>();
        //print matrix
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal");

        for (int col=0; col<n; col++){
            int i=0,j=col;
            while(i<m && j>=0){
                System.out.print(arr[i][j] + ",");
                i++;j--;
            }
            System.out.println();
        }
        for (int row=1; row<m; row++){
            int i=row,j=n-1;
            while(i<m && j>=0){
                System.out.print(arr[i][j] + ",");
                i++;j--;
            }
            System.out.println();
        }
    }

}
