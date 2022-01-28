package ds.arrays.bitmanipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinarySum {
    public static void main(String[] args) {
        addBinary("100","111");
    }

    public static String addBinary(String A, String B) {

        char []a1 = A.toCharArray();
        char []a2 = B.toCharArray();
        String result="";
        char[] r = new char[a1.length];

        if (a1.length >= a2.length) {
            int n = a1.length;
            for (int i =  n- 1; i >= 0; i--) {
                int sum = a1[i] + a2[i];
                if (sum == 2){
                    r[i] = '0';
                    r[i-1] = 1;
                }
                else if (sum==0)
                    r[i] = '0';
                else
                    r[i] = '1';
            }
        }
        System.out.println(r);
        return result;
    }
}
