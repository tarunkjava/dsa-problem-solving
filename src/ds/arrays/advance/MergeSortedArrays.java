package ds.arrays.advance;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int a[] = {2,4,6,8};
        int b[] = {1,3,5,7,9,11};
        ArrayList<Integer> list = solve(a,b);
        System.out.println(list);
    }

    public static ArrayList<Integer> solve(int[] A, int[] B) {
        ArrayList<Integer> list = new ArrayList<>();

        int n1=A.length,n2 = B.length;
        int i=0 , j=0;

        while(i<n1 && j<n2){
            if(A[i]<B[j]){
                list.add(A[i]);
                i++;
            }else{
                list.add(B[j]);
                j++;
            }
        }

        if(i<n1){
            while(i<n1){
                list.add(A[i++]);
            }
        }
        if(j<n2){
            while(j<n2){
                list.add(B[j++]);
            }
        }

        return list;
    }
}
