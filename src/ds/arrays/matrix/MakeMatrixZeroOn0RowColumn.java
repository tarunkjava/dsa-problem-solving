package ds.arrays.matrix;

public class MakeMatrixZeroOn0RowColumn {

    public static void main(String[] args) {
        int arr[][] = {{1,1,1,1},{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        int arr2[][] = {{1,1,1,1},{0,1,1,1},{1,1,1,1}};

        int m=arr.length;
        int n=arr[0].length;
        boolean rowFlag = false, colFlag = false;

        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                    if(i==0)
                        rowFlag = true;
                    if(j==0)
                        colFlag = true;
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1;j<n;j++){
                if(arr[i][0] ==0 || arr[0][j]==0)
                    arr[i][j]=0;
            }
        }

        if(rowFlag){
            for(int i=0; i<m; i++)
                arr[0][i] = 0;
        }

        if(colFlag){
            for(int i=0; i<m; i++)
                arr[0][i] = 0;
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }

}
