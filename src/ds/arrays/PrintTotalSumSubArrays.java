package ds.arrays;

public class PrintTotalSumSubArrays {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        int n = arr.length;

        //Total Sum O(n2)
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                totalSum = totalSum+sum;
            }
        }
        System.out.println("Total Sum in O(n2):" + totalSum);

        //Total Sum O(n)
        int sum=0;
        for (int i = 0; i < n; i++) {
            int s=i+1,e=n-i;
            int count = s*e;
            int contribution = count* arr[i];
            sum =sum + contribution;
        }

        System.out.println("Total sum in O(n):" + sum);

    }
}
