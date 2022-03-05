package ds.arrays.math;

public class MagicalNoPower5 {

    public static void main(String[] args) {
        int n=5;
        int power=1;
        int ans = 0;

        while(n>0){
            if((n&1)==1)
                ans = ans + (int)(Math.pow(5,power));
            n = n>>1;
            power++;
        }
        System.out.println(ans);
    }
}
