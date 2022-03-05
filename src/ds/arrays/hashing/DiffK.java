package ds.arrays.hashing;

import java.util.*;

public class DiffK {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2);
        System.out.println(diffPossible(list,0));
    }

    public static int diffPossible(final List<Integer> A, int B) {

        int a[] = A.stream().mapToInt(i->i).toArray();
        int n = a.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if (map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        if(n==1)
            return 0;
        for(int i=0; i<n; i++){
            int value = a[i] + B;

            if (B==0){
                if (map.get(value)>1)
                    return 1;
            }else if(map.containsKey(value))
                return 1;
        }
        return 0;
    }
}
