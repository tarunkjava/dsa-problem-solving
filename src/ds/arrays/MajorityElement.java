package ds.arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int a[] = {1, 1, 1, 2, 3, 5, 7 };
        int n = a.length;
        int me = a[0];
        int count=1;
        int k='A';
        System.out.println("Hello".toCharArray());

        for(int i=1; i<n; i++){
            if(a[i]==me){
                count++;
            }else{
                count--;
            }
            if(count==-2)
            {
                me = a[i];
                count=1;
            }
        }
        int mec=0;
        for(int i=0; i<n; i++){
            if(a[i]==me)
                mec++;
        }
        if(mec>n/3)
            System.out.println(me);
        else System.out.println("No ME");
    }
}
