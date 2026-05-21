package leetCode.medium;

import java.util.HashSet;

public class CommonPrefixInArrayLen {
    public static int lengthOfNumber(int n) {
        String s = String.valueOf(n);
        return s.length();
    }

    //some testcases fail
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        int len = 0;
        HashSet<Integer> prefix = new HashSet<>();
        for(int i = 0; i < arr2.length; i++) {
            String s = String.valueOf(arr2[i]);
            StringBuilder prefixStr = new StringBuilder();

            for(int j = 0; j < s.length(); j++) {
                prefixStr.append(s.charAt(j));
                prefix.add(Integer.parseInt(prefixStr.toString()));
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            if(prefix.contains(arr1[i])) {
                len = Math.max(len, lengthOfNumber(arr1[i]));
            }
        }

        return len;
    }

    public static int longestCommonPrefixFinal(int[] arr1, int[] arr2) {
        int len = 0;
        HashSet<Integer> prefix = new HashSet<>();
        for(int i = 0; i < arr2.length; i++) {

            String s = String.valueOf(arr2[i]);
            StringBuilder prefixStr = new StringBuilder();

            for(int j = 0; j < s.length(); j++) {
                prefixStr.append(s.charAt(j));
                prefix.add(Integer.parseInt(prefixStr.toString()));
            }
        }

        for(int i = 0; i < arr1.length; i++) {

            String s = String.valueOf(arr1[i]);
            StringBuilder prefixStr = new StringBuilder();

            for(int j = 0; j < s.length(); j++) {
                prefixStr.append(s.charAt(j));
                int currentPrefix = Integer.parseInt(prefixStr.toString());

                if(prefix.contains(currentPrefix)) {
                    len = Math.max(len, lengthOfNumber(currentPrefix));
                }
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr1 = {10};
        int[] arr2 = {11, 17};

        System.out.println(longestCommonPrefix(arr1, arr2));
        System.out.println(longestCommonPrefixFinal(arr1, arr2));
    }
}
