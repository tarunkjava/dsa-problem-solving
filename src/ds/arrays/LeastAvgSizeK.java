package ds.arrays;

public class LeastAvgSizeK {

    public static void main(String[] args) {

        //int arr[] = {1, 2, 3};
        //nt arr [] = {3, 7, 90, 20, 10, 50, 40};
        int arr[] = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
        int n = arr.length;
        int k=9;

        int result = maxSubArrayOfSizeK(arr,k);
        System.out.println(result);

        //18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19

    }

    public static int maxSubArrayOfSizeK(int[] a,int k) {
        int n = a.length;
        int maxSum = Integer.MIN_VALUE;
        double leastAvg = Integer.MAX_VALUE;
        int startIndex = 0;

        for(int i=0; i<=n-k; i++){
            int sum = 0;
            for(int j=i; j<k+i; j++){
                sum += a[j];
            }
            double avgSubArray = sum/k;
            if(avgSubArray < leastAvg){
                startIndex = i;
                leastAvg = avgSubArray;
            }
            System.out.println(leastAvg);
        }

        return startIndex;
    }
}
