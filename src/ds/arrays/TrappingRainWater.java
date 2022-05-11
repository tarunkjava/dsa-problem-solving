package ds.arrays;

import java.util.ArrayList;

public class TrappingRainWater {

    public static void main(String[] args) {
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
        System.out.println(trapOptimum(a));
    }

    public static int trap(int[] height) {
        ArrayList<ArrayList<Integer>> list ;
        ArrayList<Integer> r = null;
        int x = r.get(0)+1;


        int n = height.length;
        int[] lm = new int[n];
        int[] rm = new int[n];
        int res = 0;

        lm[0] = height[0];
        rm [n-1] = height[n-1];

        for(int i=1; i<n; i++){
            lm[i] = Math.max(lm[i-1],height[i]);
        }
        for(int i=n-2; i>=0; i--){
            rm[i] = Math.max(rm[i+1],height[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int maxh = Math.min(lm[i], rm[i]);
            res += Math.max(0, maxh-height[i]);
        }

        return res;
    }

    public static int trapOptimum(int[] arr){
        int result=0;
        int max=0,mi=-1;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]>max) {
                max = arr[i];
                mi = i;
            }
        }

        int lm=arr[0],maxV=max;
        for(int i=1;i<mi;i++){
            lm = Math.max(lm,arr[i-1]);
            maxV = Math.min(lm,max);
            result += Math.max(0,maxV-arr[i]);
        }
        int rm=arr[n-1],maxv = max;
        for(int i=n-2; i>mi; i--){
            rm = Math.max(rm,arr[i+1]);
            maxV = Math.min(rm,max);
            result += Math.max(0,maxV-arr[i]);
        }


        return result;
    }

}