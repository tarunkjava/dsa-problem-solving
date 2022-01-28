package ds.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Factors {

    public static void main(String[] args) {
        int no=24;
        int result = (int) Math.sqrt(no);
        System.out.println(result);
        printFactors(no);
        printFactorsOptimised(no);

        no=36;
        printFactors(no);
    }

    private static void printFactorsOptimised(int no) {
        ArrayList factors = new ArrayList();
        for (int i=1; i<=no/i; i++){
            if (no%i==0){
                factors.add(i);
                if (no != i) {
                    factors.add(no/i);
                }
            }
        }
        System.out.println("Optimised:" + factors);
    }

    private static void printFactors(int n) {
        ArrayList factors =  new ArrayList();
        Map factorsMap = new HashMap();

        factors.add(1);

        for (int i=2; i<= n/i; i++){
            if (  factorsMap.get(i)!=null )
                break;

            if (n%i ==0 ){
                factorsMap.put(i,i);
                factorsMap.put(n/i,n/i);
                factors.add(i);
                factors.add(n/i);
            }
        }
        factors.add(n);
        System.out.println("Total no of factors of " + n + " are: " + factors.size() );

        System.out.println(factors);
        System.out.println(factorsMap);
    }
}
