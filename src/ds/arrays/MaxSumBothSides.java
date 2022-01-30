package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumBothSides {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        int result = solveMaxSum(list, 3);
        System.out.println(result);
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0, maxSum = 0, leftSum = 0, rightSum = 0;
        int arr[] = A.stream().mapToInt(i -> i).toArray();
        int ls[] = new int[B];
        int rs[] = new int[B];
        int n = arr.length;
        ls[0] = arr[0];
        rs[0] = arr[n - 1];

        for (int i = 1; i < B; i++) {
            leftSum += arr[i];
            ls[i] = ls[i - 1] + arr[i];
        }

        for (int i = n - 2, j = 1; i >= n - B; i--, j++) {
            rightSum += arr[i];
            rs[j] = rs[j - 1] + arr[i];
        }
        maxSum = ls[B - 1];

        for (int i = B - 1, j = 0; i > 0; i--, j++) {
            sum = ls[i - 1] + rs[j];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static int solveMaxSum(ArrayList<Integer> A, int B) {


        int arr[] = A.stream().mapToInt(i -> i).toArray();
        int n = arr.length;
        int leftSum = 0, rightSum = 0, sum = 0, maxSum = 0;

        for (int i = 0, j = n - 1; i < B; i++, j--) {
            leftSum += arr[i];
            rightSum += arr[j];
        }
        sum = leftSum;
        maxSum = sum;
        for (int i = B - 1, j = n - 1; i >= 0; i--, j--) {
            sum = sum - arr[i];
            sum = sum + arr[j];
            maxSum = Math.max(sum, maxSum);
        }

        return Math.max(maxSum, rightSum);
    }
}
