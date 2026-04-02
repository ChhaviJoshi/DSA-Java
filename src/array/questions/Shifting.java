package array.questions;

import java.util.Arrays;

public class Shifting {
    public static void leftShift(int[] arr, int k) {
        int n = arr.length;

        while(k>0){
            int temp = arr[0];
            for(int i = 1; i < n; i++) {
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            k--;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void rightShift (int[] arr, int k) {
        int n = arr.length;

        while(k > 0) {
            int temp = arr[n-1];
            for(int i = n-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            k--;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("After left shift:");
        leftShift(arr,1);
        System.out.println();
        System.out.println("After right shift:");
        rightShift(arr, 1);
    }
}
