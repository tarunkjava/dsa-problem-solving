package ds.arrays.hashing;

import java.util.HashMap;
/*
Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array as a special pair if elements at that index in the array are equal.
Shaggy wants you to find a special pair such that distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array then return -1.
Ex: A = [7, 1, 3, 4, 1, 7]
        Here we have 2 options:
        1. A[1] and A[4] are both 1 so (1,4) is a special pair and |1-4|=3.
        2. A[0] and A[5] are both 7 so (0,5) is a special pair and |0-5|=5.
        Therefore the minimum possible distance is 3.
*/
public class ShaggyAndDistances {

    public static void main(String[] args) {
        int a[] = {7, 1, 3, 4, 1, 7};
        int n = a.length;
        int diff=Integer.MAX_VALUE;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!map.containsKey(a[i]))
                map.put(a[i],i);
            else{
                map.put(a[i],i-map.get(a[i]));
                diff = Math.min(diff, map.get(a[i]));
            }
        }

        if(diff==Integer.MAX_VALUE)
            System.out.println("No such pair exist");
        else
            System.out.println("Min distance:" + diff);
    }
}
