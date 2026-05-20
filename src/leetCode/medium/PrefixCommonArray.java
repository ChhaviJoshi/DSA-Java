package leetCode.medium;

import java.util.Arrays;
import java.util.HashSet;

public class PrefixCommonArray {

    //first approach -- not fully correct
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int[] ans = new int[A.length];
        int common = 0;

        for(int i = 0; i < A.length; i++) {
            setA.add(A[i]);
            setB.add(B[i]);
            if(setA.contains(B[i])) common++;
            if(setB.contains(A[i])) common++;
            ans[i] = common;
        }
        return ans;
    }

    public static int[] findThePrefixCommonArrayRight(int[] A, int[] B) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int[] ans = new int[A.length];
        int common = 0;

        for(int i = 0; i < A.length; i++) {

            if(setB.contains(A[i])) {
                common++;
            }

            if(setA.contains(B[i])) {
                common++;
            }

            // same number arrives together
            if(A[i] == B[i]) {
                common++;
            }

            setA.add(A[i]);
            setB.add(B[i]);

            ans[i] = common;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A,B)));
    }
}
