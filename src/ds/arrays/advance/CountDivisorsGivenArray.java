package ds.arrays.advance;

public class CountDivisorsGivenArray {
    public static void main(String[] args) {
        CountDivisorsGivenArray p = new CountDivisorsGivenArray();
        int a[] = {3,24,55};
        int res[]  = p.solve(a);

        for(int i=0; i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    //S[x] = smallest prime factor of x
    int S[], SZ, NP = 1001001;

    void sieve() {
        int n = NP;
        S = new int[n];
        for(int i = 1; i < n; i++)
            S[i] = i;
        for(int i = 2; i * i <= n; i++)
        {
            if( S[i] != i )
                continue;
            for(int j = i * i; j < n; j += i)
            {
                if(S[j] == j)
                    S[j] = i;
            }
        }
    }

    int countDivisors(int x) {
        int ans = 1;
        while(S[x] > 1) {
            int cnt = 1, u = S[x];
            while(S[x] == u) {
                cnt++;
                x /= u;
            }
            ans *= cnt;
        }
        return ans;
    }

    public int[] solve(int[] a) {
        sieve();
        int n = a.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++)
            ans[i] = countDivisors(a[i]);
        return ans;
    }
}
