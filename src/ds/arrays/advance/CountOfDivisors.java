package ds.arrays.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class CountOfDivisors {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = solve(360);
        System.out.println(list);
    }

    public static ArrayList<Integer> solve(int n) {

        //int a[] = A.stream().mapToInt(i->i).toArray();
        ArrayList<Integer> list = new ArrayList<>();

        int spf[] = new int[n+1];

        for(int i=0; i<n+1; i++){
            spf[i] = i;
        }

        for (int i=2; i<n+1; i++){

            if(spf[i] == i){
                for (int j=i*i; j<n+1; j=j+i){
                    if(spf[j] ==j)
                        spf[j] = i;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            int x=i;
            HashMap<Integer,Integer> map = new HashMap<>();
            while(x>1){
                if(map.get(spf[x])==null)
                    map.put(spf[x],1);
                else
                    map.put(spf[x],map.get(spf[x])+1);
                x = x/spf[x];
            }

            if(spf[i]==i)
                list.add(2);
            else{
                int sum=1;
                for(Integer key : map.keySet()){
                    int val = map.get(key)+1;
                    sum *= val;
                }
                list.add(sum);
            }
        }

        return list;

    }

}
