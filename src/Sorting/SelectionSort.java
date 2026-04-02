package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int minIndexArray(int[] arr, int startIndex, int endIndex) {
        int minIndex = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            swap(arr, i, minIndexArray(arr, i, arr.length-1));
        }
    }

//-----------------------------------------------------------------------

    static void selectionSortDirect(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 40, 10, 30, 20};
        selectionSort(arr);
        selectionSortDirect(arr);
        System.out.println(Arrays.toString(arr));
    }
}
