package ds.arrays.string;

import java.util.HashMap;

//Palindrome by any arrangement
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solve("inttnikjmjbemrberk"));
    }

    public static int solve(String A) {

        char[] ch = A.toCharArray();
        int n = ch.length;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(ch[i]))
                map.put(ch[i],map.get(ch[i])+1);
            else
                map.put(ch[i],1);
        }
        int countOdd = 0;
        for(Character key : map.keySet()){
            if(map.get(key)%2!=0)
                countOdd++;
        }

        if(countOdd>1)
            return 0;

        return 1;
    }
}
