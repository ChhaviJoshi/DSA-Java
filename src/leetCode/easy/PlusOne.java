package leetCode.easy;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String num = "";
        for(int d : digits) {
            num += d;
        }
        long n = Long.parseLong(num);
        n++;

        String newStr = String.valueOf(n);

        int[] arr = new int[newStr.length()];

        for(int i = 0; i < newStr.length(); i++) {
            arr[i] = newStr.charAt(i) - '0';
        }

        return arr;
    }

    public static int[] plusOnegpt(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just add 1 and return
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and continue left
            digits[i] = 0;
        }

        // If all digits were 9, create new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {9};
        //System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println(Arrays.toString(plusOnegpt(arr)));
    }
}
