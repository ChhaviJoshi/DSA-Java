package leetCode.easy.string;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        //O(1)
        if (s.length() != t.length()) {
            return false;
        }

        //O(n)
        char[] arr1 = new char[s.length()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.charAt(i);
        }
        //O(nlogn)
        Arrays.sort(arr1);

        //O(n)
        char[] arr2 = t.toCharArray();
        //a string can directly be converted into char array by this method
        //we could either use loop or directly this method to create the array

        //O(n)
        return Arrays.equals(arr1, arr2);
    }

    //------------------------------------------------

    static {
        for (int i = 0; i < 500; i++) {
            optimalIsAnagram("", "a");
        }
    }

    static boolean optimalIsAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];

        //O(n)
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        //O(26)~~O(1)
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "bat";
        String t1 = "tab";

        System.out.println(isAnagram(s1, t1));
        System.out.println(optimalIsAnagram(s1, t1));
    }
}