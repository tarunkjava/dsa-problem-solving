package ds.arrays.matrix;

import java.util.ArrayList;

public class PrintAntiDiagonalSquare {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int m=arr.length;
        int n=arr[0].length;

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<ArrayList<Integer>>();


        System.out.println("Diagonal");

        for (int col=0; col<n; col++){
            int i=0,j=col;
            while(i<n){
                if(i<=j)
                    System.out.print(arr[i][j] + ",");
                else
                    System.out.print("0 ,");
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
