package ds.arrays;

public class ToggleBulb {

    public static void main(String[] args) {
        System.out.println((4&3));
        System.out.println(56&1);

        int arr[] = {0, 0,0,0,1,1,1,1};
        int n = arr.length;
        boolean flip=false;
        int count=0;

        for(int i=0; i<n; i++) {
            if (!flip && arr[i] == 0) {
                count++;
                flip = true;
            }
            if (flip && arr[i] == 1) {
                flip = false;
                count++;
            }
        }

        System.out.println(count);
    }
}
