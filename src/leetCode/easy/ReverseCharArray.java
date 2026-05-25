package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseCharArray {
    public static void reverseString(char[] s) {

        //--with array return type--
//        int n = s.length;
//        String[] rev = new String[n];
//
//        for(int i = n - 1; i >= 0; i++){
//            rev[n - i] = String.valueOf(s[i]);
//        }
//        return rev;

        int first = 0;
        int last = s.length-1;
        char temp ;

        while(last > first) {
            temp = s[first];
            s[first] = s[last];
            s[last] = temp;

            first++;
            last--;
        }
        }

    public static void main(String[] args) {
    String[] arr = {"h","e","l","l","o"};
        System.out.println(Arrays.toString(arr));
    }

}
