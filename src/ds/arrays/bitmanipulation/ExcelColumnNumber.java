package ds.arrays.bitmanipulation;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("ABCD"));
    }

    public static int titleToNumber(String A) {

        char a[] = A.toCharArray();
        int n = a.length;
        int value=0;
        int power=0;

        for(int i=n-1; i>=0; i--){

            int v=a[i]-'A'+1;
            value += (int)Math.pow(26,power)* v;
            power++;
        }
        return value;
    }

}
