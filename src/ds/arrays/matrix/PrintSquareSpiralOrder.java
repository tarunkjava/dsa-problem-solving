package ds.arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class PrintSquareSpiralOrder {

    public static void main(String[] args) {
        int [] [] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13,14,15,16}};
        List<Integer> integerList = spiralOrder(matrix);
        System.out.println(integerList);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0, count = 0;

        while(n>1){

            count=0;
            while(count<n-1){
                list.add(matrix[i][j]);
                j++;
                count++;
            }

            count=0;
            while(count<n-1){
                list.add(matrix[i][j]);
                i++;
                count++;
            }

            count=0;
            while(count<n-1){
                list.add(matrix[i][j]);
                j--;
                count++;
            }

            count=0;
            while(count<n-1){
                list.add(matrix[i][j]);
                i--;
                count++;
            }

            i++;j++;
            n = n-2;
        }

        if(n==1)
            list.add(matrix[i][j]);

        return list;
    }
}
