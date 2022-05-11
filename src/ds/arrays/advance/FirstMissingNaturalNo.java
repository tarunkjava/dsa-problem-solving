package ds.arrays.advance;

public class FirstMissingNaturalNo {

    public static void main(String[] args) {
        int a[] = {3,4,-1,1};
        int b[] = {1};

        System.out.println(firstMissingPositive(a));
        System.out.println(firstMissingPositive(b));
    }

    public static int firstMissingPositive(int[] a) {
        int n = a.length;

        for(int i=0; i<n; i++){

            while(a[i]>0 && a[i]<n+1){
                if(a[i] == i-1 || a[i] == a[a[i]-1])
                    break;
                else
                    swap(a,i,a[i]-1);
            }
        }
        boolean notFound = true;
        for(int i=0; i<n; i++){
            if(a[i]!=i+1 )
            {
                notFound = false;
            }
        }
        if (notFound)
            return n+1;
        return -1;
    }

    public static void swap(int[]a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
