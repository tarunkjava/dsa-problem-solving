package ds.arrays.matrix;

public class MaxKElements {

    public static void main(String[] args) {
        int arr[] = {5,-2,3,1,2};
        int n=arr.length;
        int k=3;
        int sum=0;
        int ans=0;
        for(int i=0;i<k;i++)
            sum += arr[i];

        ans=sum;

        int p1=k-1, p2=n-1;

        while(p1>=0){
            sum += arr[p2] -arr[p1];
            p1--;p2--;
            ans=Math.max(sum,ans);
        }

        System.out.println(ans);
    }
}
