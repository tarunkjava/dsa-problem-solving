package ds.arrays;

public class PrintAllSubArraysIndexOfSizeK {

    public static void main(String[] args) {

        int arr[] = {1,3,4,2,-1,6,7,8,9,2,-1,4};
        int n = arr.length;
        int k=5;

        for(int i=0;i<n-k;i++){
            System.out.println("SI:" + i +  ",EI:" + (k+i-1));
        }
    }
}
