package ds.arrays.matrix;

public class PrintDiagonalSquareMatrix {

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //print matrix
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        //print left top- right bottom
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[0].length; col++){
                if(row==col)
                    System.out.print(arr[row][col] + " ");
            }
        }

        System.out.println();
        //print rihgt top - left bottom
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[0].length; col++){
                if(col == arr.length-row-1)
                    System.out.print(arr[row][col] + " ");
            }
        }

        System.out.println();
        //single loop o(n)
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        for (int i=0; i<arr.length; i++){
            int j = arr.length-i-1;
            System.out.print(arr[i][j] + " ");
        }


    }
}
