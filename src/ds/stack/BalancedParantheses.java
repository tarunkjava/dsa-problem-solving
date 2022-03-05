package ds.stack;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        System.out.println(solve("(())"));
    }

    public static int solve(String A) {
        char[] chars = A.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: chars){
            if(c=='(')
                stack.push(c);
            else{
                if (stack.isEmpty())
                    return 0;
                stack.pop();
            }

        }
        if (stack.isEmpty())
            return 1;
        else return 0;
    }

}
