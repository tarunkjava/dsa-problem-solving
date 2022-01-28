package ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> threeSumList = findThreeSum(arr);
        System.out.println(threeSumList);
    }

    private static List<List<Integer>> findThreeSum(int[] arr) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        List<List<Integer>> threeSumListValues = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ( arr[i] + arr[j] + arr[k] ==0) {
                        ArrayList triplets = new ArrayList();
                        triplets.add(i);
                        triplets.add(j);
                        triplets.add(k);
                        threeSumList.add(triplets);
                    }
                }
            }
        }

        return threeSumList;
    }

}
