package ds.arrays.bitmanipulation;

public class ToggleEveryBit {

    public static void main(String[] args) {

        int n=11;
        System.out.println(n^1);
        for(int i=0;i<32;i++){
            n = n ^ (1<<i);
        }

        System.out.println(n);
    }
}
