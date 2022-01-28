package ds.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {
        int arr []  = {-3,6,2,4,5,2,8,-9,3,1};
        List<Integer> ps =  new ArrayList();
        ps.add(arr[0]);

        for (int i=1; i<arr.length; i++)
        {
            ps.add(ps.get(i-1)+arr[i]);
        }

        System.out.println(ps);
    }

}
