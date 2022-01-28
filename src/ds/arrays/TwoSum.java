package ds.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3, -2, 1, 4, 6, 8, 9, 2};
        int sum = 11;
        int arr2[];
        printTwoSum(arr,sum);
        printTwoSumOptimised(arr,sum);
    }

    public static void printTwoSum(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(i + "," + j);
                    break;
                }
            }
        }
    }

    public static void printTwoSumOptimised(int[] arr, int sum){
        HashMap map =new HashMap();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(i + "," + j);
                    break;
                }
            }
        }
    }
}

