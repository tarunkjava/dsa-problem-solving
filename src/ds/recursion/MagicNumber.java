package ds.recursion;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(solve(83));
    }

    public static  int solve(int a) {

        if(a%9 == 1){
            return 1;
        }
        return 0;
    }
}
