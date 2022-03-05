package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LargestContinuousSeqZero {

    public static void main(String[] args) {
        int a[] = {1,2,-2,4,-4};
        int n = a.length;

        int sum[] = new int[n];
        ArrayList<Integer> result = new  ArrayList<>();

        sum[0] = a[0];
        for(int i=1; i<n; i++){
            sum[i] = sum[i-1] + a[i];
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maxDiff = Integer.MIN_VALUE;
        int si=0,ei=0;

        for(int i=0; i<n; i++){

            if(map.get(sum[i])!=null){
                if(i-map.get(sum[i])>maxDiff){
                    si=map.get(sum[i])+1;
                    ei=i;
                    maxDiff = i-map.get(sum[i]);
                }
            }else map.put(sum[i],i);
        }

        for(int i=si; i<=ei; i++)
            result.add(a[i]);
        System.out.println(result);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,-2,4,-4));
        ArrayList<Integer> res = lszero(list);
        System.out.println(res);
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {

        ArrayList<Integer> rst = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(A == null) return rst;
        int len = 0;
        int sum = 0;
        int l = -1, r = -1;
        map.put(0, -1);
        for(int i = 0; i < A.size(); i++){
            sum += A.get(i);
            if(!map.containsKey(sum))
                map.put(sum, i);
            else{
                if(i - map.get(sum) > len){
                    l = map.get(sum) + 1;
                    r = i;
                    len = i - map.get(sum);
                }
            }
        }
        if(l >=0 && r >= 0){
            for(int i = l; i <= r; i++){
                rst.add(A.get(i));
            }
        }
        return rst;

    }
}
