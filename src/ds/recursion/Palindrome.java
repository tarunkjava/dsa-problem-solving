package ds.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String A = "naman";
        char[] a = {'a','b','c'};
        A = A + String.copyValueOf(a);
        char c = 'a';
        System.out.println(c);
        c -= 32;
        System.out.println(c);
        System.out.println(A);
        //Integer.pa
        char[] str = A.toCharArray();
        int s=0,e=A.length()-1;

        System.out.println(isPalindrome(str,s,e));
    }

    public static int isPalindrome(char[] str,int s,int e){
        if(s>=e)
            return 1;
        if(str[s]!=str[e])
            return 0;

        return isPalindrome(str,s+1,e-1);
    }
}
