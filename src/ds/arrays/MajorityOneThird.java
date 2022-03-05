package ds.arrays;

public class MajorityOneThird {

    public static void main(String[] args) {
        int a[]= {1, 1, 1, 2, 3, 5, 7};
        int res = findMajority(a);
        System.out.println(res);
    }

    public static int findMajority(int a[]){
        int n = a.length;
        int me1 = a[0];
        int me2 = a[1];
        int count1=1,count2=1;
        if(me1==me2) {
            count1++;
            count2++;
        }
        for(int i=2; i<n; i++){
            if(a[i]==me1){
                count1++;
            }
            if (a[i]==me2){
                count2++;
            }
            else{
                count1--;
                count2--;
                if(count1==0 && count2==0){
                    me1 = a[i];
                    me2 = a[i];
                    count1=1;
                    count2=1;
                }else if (count1==0){
                    me1 = a[i];
                    count1=1;
                }else if(count2==0){
                    me2 = a[i];
                    count2=1;
                }
            }


        }
        int mec=0;
        for(int i=0; i<n; i++){
            if(a[i]==me1)
                mec++;
        }
        if(mec>n/3)
            return me1;

        mec=0;
        for(int i=0; i<n; i++){
            if(a[i]==me2)
                mec++;
        }
        if(mec>n/3)
            return me2;

        else return -1;
    }
}
