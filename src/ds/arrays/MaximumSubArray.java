package ds.arrays;

public class MaximumSubArray {

    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr2 [] = {1,2,3};
        int ans = maxSubArray(arr);
        System.out.println(ans);
        ans = maxSubArrayOptimum(arr);
        System.out.println(ans);
        ans = maxSubArrayBest(arr);
        System.out.println(ans);
        int arr3[] ={ 34, 75, 69, 43, 8, 34, 54, 79, 7, 39, 64, 85, 37, 14, 50, 40, 78, 5, 98, 13, 89, 45, 30, 66, 50, 90, 28, 13, 64, 44, 78, 58, 94, 100, 65, 88, 69, 48, 41, 64, 56, 60, 100, 95, 96, 66, 11, 92, 32, 17, 65, 39, 42, 90, 37, 20, 21, 24, 93, 47, 26 };
        int B=8;
        ans = maxSubArrayBestLessThanB(arr3,B);
        System.out.println("Less Than B:" + ans);
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

    //O(N)
    public static int maxSubArrayBestLessThanB(int[] a, int B) {
        int maxSum = Integer.MIN_VALUE;
        int n = a.length;
        if(a[0]<B)
            maxSum = a[0];


        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += a[j];
                if (sum<=B && maxSum <sum) maxSum = sum;
            }

        }
        if(maxSum<=B)
            return maxSum;
        else return 0;
    }
}
