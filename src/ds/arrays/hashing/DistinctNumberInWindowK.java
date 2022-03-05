package ds.arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctNumberInWindowK {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(Arrays.asList(1, 2, 1, 3, 4, 3 ));
        System.out.println(dNums(list,3));
    }

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        int a[] = A.stream().mapToInt(i->i).toArray();
        int n = a.length;
        //"HH".le
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<B; i++){
            if(map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(map.keySet().size());

        for(int i=1; i<=n-B; i++){
            if(map.get(a[i-1])==1)
                map.remove(a[i-1]);
            else
                map.put(a[i-1],map.get(a[i-1])-1);
            if(map.containsKey(a[i+B-1]))
                map.put(a[i+B-1],map.get(a[i+B-1])+1);
            else
                map.put(a[i+B-1],1);
            res.add(map.keySet().size());
        }
        return res;
    }
}
