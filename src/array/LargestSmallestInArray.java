package array;
import java.util.*;

public class LargestSmallestInArray {
    public static int largestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestInArray(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 8, 3};
        System.out.println(largestInArray(a));
        System.out.println(smallestInArray(a));
    }
}


