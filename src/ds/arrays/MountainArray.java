package ds.arrays;

public class MountainArray {
    public static void main(String[] args) {
        int a[] = {4,4,3,2,1};
        System.out.println(validMountainArray(a));
    }

    public static boolean validMountainArray(int[] a) {

        int n = a.length;
        int max = 0,mi=-1;

        for(int i=0; i<n; i++){
            if(a[i]>=max){
                mi = i;
                max = a[i];
            }
        }
        if(mi ==0 || mi==n-1)
            return false;

        for(int i=0; i<mi; i++){
            if(a[i+1]<=a[i])
                return false;
        }

        for(int i=mi+1; i<n-1; i++){
            if(a[i+1]>=a[i])
                return false;
        }

        return true;
    }
}
