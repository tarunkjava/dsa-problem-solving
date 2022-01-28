package ds.arrays;

public class PrintSumSubArrays {

    public static void main(String[] args) {

        //int arr[] = {1, 2, 3};
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;


        //print sum each sub array O(n3)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                System.out.println(sum);
            }
        }

        System.out.println("O(n2)");
        //print sum each sub array O(n2)
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                System.out.println(sum);
            }
        }

    }
}
