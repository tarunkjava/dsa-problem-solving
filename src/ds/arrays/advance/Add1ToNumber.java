package ds.arrays.advance;

public class Add1ToNumber {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int n = a.length , counter=0;
        int sum = 0 ;

        for (int i=n-1; i>=0; i--){
            sum += a[i] * Math.pow(10,counter++);
        }

        System.out.println(sum);
    }
}
