package ds.recursion;

public class Power {
    public static void main(String[] args) {
        int res = pow(2,4,255);
        int x = (int)Math.pow(-1,1);
        System.out.println(x%20);
        System.out.println(res);
    }

    public static int pow(int A, int B, int C) {
        int xSq =0;
        if(B==0)
            return 1%C;
        else{
            int x = pow(A,B/2,C);
            xSq = ((x%C) * (x%C))%C;
        }
        if (B%2==1)
            return ((A%C)*xSq)%C ;
        else
            return xSq;
    }
}
