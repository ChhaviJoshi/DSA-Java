package Sorting;

import java.util.Arrays;

public class BubbleSort {

    //if normal swap function was written, it would've called by value and values won't have been updated
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr){
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        while(n > 0) {
            for (int i = 0; i <= n - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i+1);
                }
            }
            n--;
        }
    }

    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    //for arr.length = n, it would take n-1 turns for sorting
    public static void apnaClgBubbleSort(int[] arr) {
        boolean swap;
        for(int turn = 0; turn < arr.length-1; turn++) {
            swap = false;
            for(int i = 0; i < arr.length-1-turn; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);

       int[] arr1 = {1, 2, 3, 4, 5};
        bubbleSort(arr1);
        printArr(arr1);

        optimizedBubbleSort(arr1);
        printArr(arr1);

        apnaClgBubbleSort(arr1);
        System.out.println(Arrays.toString(arr));
    }
}
