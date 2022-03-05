package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAG {

    public static void main(String[] args) {
        char[] arr = {'a','b','c','g','g','a','k','g'};
        int ans=0;
        int n = arr.length;
        for (int i=0; i<n; i++){
            if(arr[i] == 'a')
                for(int j=i+1; j<n; j++){
                    if(arr[j] == 'g')
                    ans++;
                }
        }
        ArrayList<ArrayList<Integer>> B =new ArrayList<ArrayList<Integer>>();

        System.out.println(ans);
    }
}
