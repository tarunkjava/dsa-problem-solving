package ds.recursion;

import java.util.Stack;

public class MagicSum {

    public static void main(String[] args) {
        int no = 1291;
        int res =  solve(no);
        while(res%10>9){
            res = solve(res);
        }
        Stack stack = new Stack();
        System.out.println(solve(res));
    }
    public static int solve(int A) {

        if(A/10==0)
            return A;
        int res = solve(A/10) + A%10;
        return res;

    }
}
