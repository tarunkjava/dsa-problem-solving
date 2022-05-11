package ds.arrays.advance;

public class CountPairGivemSum {

    public static void main(String[] args) {

        int a[] = {5, 10, 20, 100, 105};
        int sum = 110;
        int result = countPairs(a, sum);

        System.out.println(result);
    }

    private static int countPairs(int[] a, int B) {

        int n = a.length;

        int i = 0, j = n - 1;
        int count = 0;

        while (i < j) {
            int sum = a[i] + a[j];
            if (sum == B) {
                count++;
                i++;
                j--;
            } else if (sum > B)
                j--;
            else
                i++;

        }

        return count;
    }


}
