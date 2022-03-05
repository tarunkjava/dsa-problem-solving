package ds.arrays;

import java.util.Arrays;

public class NobleInteger {

    public static void main(String[] args) {
        //int a[] = {3, 2, 1, 3};
        int a[] = {-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5};
        //int a[] = A.stream().mapToInt(i->i).toArray();
        int n = a.length;

        Arrays.sort(a);
        for(int i=0,j=n-1; i<n/2; i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        if(a[0]==0)
            System.out.println(a[0]);

        for(int i=1;i<n;i++) {
            if(a[i-1]==a[i] && a[i-1]==0)
                continue;
            if (a[i] == i) {
                System.out.println(a[i]);
            } else if(a[i] == a[i-1] && a[i-1]==i-1){
                System.out.println(a[i]);
            }
        }
        /*for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(a[j]>a[i])
                        count++;
                }
            }
            if(a[i]==count)
                System.out.println(a[i]);

        }
        */
    }
}
