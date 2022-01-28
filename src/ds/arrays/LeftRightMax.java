package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRightMax {

    public static void main(String[] args) {
         int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
         int n= arr.length;
         int leftMax [] = new int[n];

        int rightMax [] = new int[n];

         leftMax[0] = arr[0];
         rightMax[n-1] = arr[n-1];

         for(int i=1; i<n; i++){
            if(arr[i] >leftMax[i-1])
                leftMax[i] = arr[i];
            else
                leftMax[i] = leftMax[i-1];
        }

        for(int i=n-2; i>0; i--){
            if(arr[i] >rightMax[i+1])
                rightMax[i] = arr[i];
            else
                rightMax[i] = rightMax[i+1];
        }

        System.out.println("Origional Array");
        for(int i=1; i<n; i++){
            System.out.print(arr[i] + ",");
        }

        System.out.println("\nLeftMax");
        for(int i=1; i<n; i++){
            System.out.print(leftMax[i] + ",");
        }

        System.out.println("\nRightMax");

        for(int i=1; i<n; i++){
            System.out.print( rightMax[i] + ",");
        }
    }
}
