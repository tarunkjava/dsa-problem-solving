package ds.arrays.hashing;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8);
        //System.out.println(twoSum(list,-3));
        List<Integer> list = Arrays.asList(2,7,11,15);
        System.out.println(twoSum(list,9));
    }

    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int a[] = A.stream().mapToInt(i->i).toArray();
        int n = a.length;
        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer,Integer> imap = new HashMap<>();

        for(int i=0; i<n; i++){
            int value = B-a[i];
            if(imap.containsKey(a[i])){
                res.add(imap.get(a[i])+1);
                res.add(i+1);
                break;
            }else if(!imap.containsKey(value)){
                imap.put(value,i);
            }
        }
        return res;
    }

}
