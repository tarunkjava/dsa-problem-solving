package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquilibriumIndex {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-7, 1, 5, 2, -4, 3, 0);
        int ps [] = {-7,-6,-1,1,-3,0,0};
        System.out.println(solve(list));

    }

    public static int solve(List<Integer> A){
        final int[] out = new int[A.size()];
        Arrays.setAll(out, A::get);
        int [] ps = new int[A.size()];

        ps[0] = out[0];
        for(int i=1; i<out.length; i++){
            ps[i] = ps[i-1] + out[i];
        }

        if(ps[1] == 0)
            return 0;

        for (int i=2; i<A.size(); i++){
            if (ps[i-1] == (ps[A.size()-1] - ps[i]) )
                return i;
        }

        if(ps[A.size()-2] == 0)
            return A.size()-1;

        return -1;
    }
}
