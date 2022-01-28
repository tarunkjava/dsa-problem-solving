package ds.arrays;

import java.util.ArrayList;

public class SpecialIndex {

    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A){

        int arr[] = new int[A.size()];
        int x=0;
        for (Integer a: A){
            arr[x++] = a;
        }

        int n = arr.length;
        int countSpecialIndexes = 0;

        int psEven [] = new int[n];
        int psOdd [] = new int[n];
        psEven[0] = arr[0];
        psOdd[0] = 0;

        for(int i=1; i<n; i++) {
            if (i % 2 == 0) {
                psEven[i] = psEven[i - 1] + arr[i];
                psOdd[i] = psOdd[i-1];
            } else {
                psEven[i] = psEven[i-1];
                psOdd[i] = psOdd[i - 1] + arr[i];
            }
        }

        if( (psOdd[n-1]) == psEven[n-1]-psEven[0] ){
            countSpecialIndexes++;
        }

        int sumEven = 0, sumOdd=0;
        for (int i=1; i<n-1;i ++){
            sumEven = psEven [i-1] + (psOdd[n-1] - psOdd[i]);
            sumOdd = psOdd[i-1] + (psEven[n-1] - psEven[i]);
            if (sumEven == sumOdd){
                countSpecialIndexes++;
            }
        }
        if( (psOdd[n-1]) == psEven[n-1] ){
            countSpecialIndexes++;
        }

        return countSpecialIndexes;
    }

}
