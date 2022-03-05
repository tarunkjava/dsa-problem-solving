package ds.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindAP {

    public static void main(String[] args) {
        int a[] = {1,3,5};
        int n = a.length;

        Arrays.sort(a);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int diff = Math.abs(a[1]-a[0]);

        for(int i=1;i<n-1;i++){
            if( Math.abs(a[i+1]-a[i]) != diff) {
                System.out.println("Not AP");
                return;
            }
        }
        System.out.println("AP");
    }
}
