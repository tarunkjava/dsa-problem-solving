package ds.arrays.advance.sorting;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(1);

        ArrayList<Integer> result = solve(list);
        System.out.println(result);

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[]  = A.stream().mapToInt(i->i).toArray();
        int n = arr.length;
        mergeSort(arr,0,n);

        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);

        return list;
    }

    private static void mergeSort(int[] arr, int s,int e) {
        if(s==e)
            return;

        int m = (s+e)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m+1,e);
        merge(arr,s,m,e);
    }

    private static void merge(int[] arr, int s,int m, int e) {
        int n1 = m-s+1, n2 = e-m+1+1;
        int a[] = new int[n1];
        int b[] = new int[n2];
        int index = 0;
        for(int i=s;i<=m;i++)
        {
            a[index++] = arr[i];
        }
        index = 0;
        for(int i=m+1;i<e;i++)
        {
            b[index++] = arr[i];
        }

        int i=0 , j=0;
        index=0;

        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                arr[index++] = a[i];
                i++;
            }else{
                arr[index++] = b[j];
                j++;
            }
        }

        if(i<n1){
            while(i<n1){
                arr[index++] = a[i++];
            }
        }
        if(j<n2){
            while(j<n2){
                arr[index++] = b[j++];
            }
        }
    }

}
