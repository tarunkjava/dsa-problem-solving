package ds.arrays;

import java.util.HashSet;

public class SubArrayWith0Sum {

    public static void main(String[] args) {
        int a[] = {6,1,-1};
        int  n = a.length;
        int ps[] = new int[n];
        ps[0] = a[0];

        HashSet<Integer> set = new HashSet<>();

        for(int i=1; i<n; i++)
        {
            ps[i] = ps[i-1] + a[i];
        }

        for(int i=0; i<n; i++)
        {
            if(ps[i]==0){
                System.out.println("Sub array exist with 0 sum");
                return;
            }
            if(!set.add(ps[i])) {
                System.out.println("Sub array exist with 0 sum");
                return;
            }
        }

        System.out.println("No Sub aray exist with 0 sum");
    }
}
