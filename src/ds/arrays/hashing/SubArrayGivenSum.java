package ds.arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //ps 1,3,6,10,15
        ArrayList<Integer> res = solve(list,5);
        System.out.println(res);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int a[] = A.stream().mapToInt(i->i).toArray();
        int n = a.length;
        HashMap<Long,Integer> map = new HashMap<>();

        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> emptyList = new ArrayList<>();
        emptyList.add(-1);

        long ps[] = new long[n];
        ps[0] = a[0];

        for(int i=1; i<n; i++){
            ps[i] = ps[i-1] + a[i];
        }

        for(int i=0; i<n; i++){
            map.put(ps[i],i);
        }
        int si=-1,ei=-1;

        for(int i=1; i<n; i++){
            if(ps[i]==B){
                si = 0;
                ei = i;
                break;
            }
            long value = ps[i]-B;
            if(map.get(value)!=null){
                si = map.get(value)+1;
                ei = i;
                break;
            }
        }

        if(si != -1){
            for(int i=si; i<=ei; i++)
                res.add(a[i]);
            return res;
        }else
            return emptyList;

    }
}
