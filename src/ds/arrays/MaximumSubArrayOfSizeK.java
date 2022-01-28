package ds.arrays;

public class MaximumSubArrayOfSizeK {

    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr2 [] = {1,2,3};
        int k=5;
        int ans = maxSubArrayOfSizeK(arr,k);
        System.out.println(ans);
        ans = maxSubArrayOptimum(arr);
        System.out.println(ans);
        ans = maxSubArrayBest(arr);
        System.out.println(ans);
    }

    public static int maxSubArrayOfSizeK(int[] a,int k) {
        int n = a.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n-k; i++){
            int sum = 0;
            for(int j=i; j<k; j++){
                sum += a[j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }

    //O(n3)
    public static int maxSubArray(int[] a) {
        int maxSum = a[0];
        int n = a.length;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += a[k];
                }
                if (maxSum <sum) maxSum = sum;
            }
        }

        return maxSum;
    }

    //O(N2)
    public static int maxSubArrayOptimum(int[] a) {
        int maxSum = a[0];
        int n = a.length;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += a[j];
                if (maxSum <sum) maxSum = sum;
            }

        }

        return maxSum;
    }

    //O(N)
    public static int maxSubArrayBest(int[] a) {
        int maxSum = a[0];
        int currentSum = a[0];
        int n = a.length;

        for(int i=1; i<n; i++){

            currentSum = Math.max(currentSum+a[i],a[i]);
            maxSum = Math.max(currentSum,maxSum);
        }

        return maxSum;
    }
}
