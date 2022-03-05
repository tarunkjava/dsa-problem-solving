package ds.arrays;

public class SortByColor {
    public static void main(String[] args) {

        int a[] = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2 };
        //int a[] = {0,1,2,0,1,2};
        int n = a.length;
        int count0=0,count1=0,count2=0;

        for(int i=0; i<n; i++){
            if(a[i]==0)
                count0++;
            else if(a[i]==1)
                count1++;
            else
                count2++;
        }

        for(int i=0; i<count0; i++)
            a[i] = 0;
        for(int i=count0,j=0; j<count1; i++,j++)
            a[i] = 1;
        for(int i=count0+count1,j=0; j<count2; i++,j++)
            a[i] = 2;

        for(int i=0; i<n; i++){
            System.out.print(a[i] + ",");
        }
    }
}
