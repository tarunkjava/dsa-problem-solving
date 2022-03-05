package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyRobot {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); //1,0,2,3,2
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(2);

        ArrayList solve = solve(list);
        System.out.println(solve);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        int a[] = A.stream().mapToInt(i->i).toArray();
        int n = a.length;
        int[] r = new int[n];

        for (int i=0; i<n; i++)
            r[i]=1;

        for (int i=0; i<n; i++){
            if(a[i]>0) {
                if (i - a[i] >= 0)
                    increase(r, i - a[i], i-1);
                else
                    increase(r, 0, i-1);
                if (i + a[i] <= n)
                    increase(r, i + 1, i + a[i]);
                else
                    increase(r, i + 1, n-1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=n-1 ;i++){
            list.add(r[i]);
        }
        return list;
    }

    private static void increase(int r[], int m, int n){
        for(int i=m; i<=n; i++){
            r[i]++;
        }
    }
}
