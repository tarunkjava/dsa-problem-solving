package ds.arrays;

public class Sqrt {
    public static void main(String[] args) {
        int no = 700;
        Math.sqrt(no);
        System.out.println(getSqrt(no));
    }

    private static int getSqrt(int no) {
        int step = 0;
        for(int i=1; i*i<=no ; i++){
            step++;
            if(i*i == no){
                System.out.println("Steps = " + step);
                return i;
            }
        }
        System.out.println("Steps = " + step);
        return -1;
    }
}
