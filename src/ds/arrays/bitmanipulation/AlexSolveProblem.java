package ds.arrays.bitmanipulation;

public class AlexSolveProblem {
    public static void main(String[] args) {
        System.out.println(solveWithBinary(17));
    }

    public static int solve(int A) {
        int sum=1;
        int i=1;
        int count=0;

        if(A==0)
            return 0;
        while(sum<=A){
            sum = 1 <<i++;
        }
        sum = sum/2;
        if(sum<A)
            count = (A-sum);
        return count+1;
    }

    public static int solveWithBinary(int A) {
        int count=0;
        int no = A;
        while(no > 0){
            if(no%2==1)
                count++;
            no=no/2;
        }
        return count;
    }
}
