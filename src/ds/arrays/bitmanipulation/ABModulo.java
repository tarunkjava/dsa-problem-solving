package ds.arrays.bitmanipulation;

public class ABModulo {
    public static void main(String[] args) {
        int A=106978,B=4487506;
        int smallerNo;

        if(A<B)
            smallerNo = A;
        else
            smallerNo = B;
        int m=0;
        for(int i=smallerNo; i>0 ;i--){
            if(A%i == B%i){
                m=i;
                break;
            }
        }

        System.out.println(m);
    }
}
