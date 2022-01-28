package ds.arrays;

public class StockPrice {
    public static void main(String[] args) {
        int arr[] = {88,57,44,92,28,66,60,37,33,52,38,29,76,8,75};
        int arr2[] = {59,96,30,38,36,94,19,29,44,12,29,30,77,5,44,64,14,39,7,41,5,19};
        int arr3[] = {1,2};

        int result = findMaxDiff(arr,arr.length);
        System.out.println(result);
        result = findMaxDiff(arr2,arr2.length);
        System.out.println(result);
        result = findMaxDiffOptimum(arr3,arr3.length);
        System.out.println(result);
    }

    static int findMaxDiff(int a[], int n)
    {
        int maxDiff = 0;

        for(int i=0; i<n-1; i++){

            for(int j=i+1; j<n; j++) {
                if( a[j]-a[i]>maxDiff ) {
                    maxDiff = a[j]-a[i];
                }
            }

        }

        return maxDiff;
    }
    //7,1,5,6,3,4
    static int findMaxDiffOptimum(int a[], int n)
    {
        int leftMin = a[0];
        int maxDiff = 0;

        for(int i=0; i<n; i++){
            if(leftMin>a[i])
                leftMin = a[i];

            if(a[i]-leftMin > maxDiff)
                maxDiff = a[i]-leftMin;
        }

        return maxDiff;
    }
}