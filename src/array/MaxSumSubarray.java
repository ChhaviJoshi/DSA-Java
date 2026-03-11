package array;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarray {

//    public static void maxSum(int arr[]) {
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if(max < sum){
//                    max = sum;
//                }
//            }
//        }
//        System.out.println("value of max sum among each subarray is " + max);
//    }
//-------------
//    public static void maxSumSubarr(int arr[]) {
//        List<Integer> sumArr = new ArrayList<>();
//        int max = Integer.MIN_VALUE;
//        int maxIndex = -1; // to track where max sum is stored
//
//        int subarrNo = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j]; // sum of subarray from i to j
//                sumArr.add(sum);
//
//                if (sum > max) {
//                    max = sum;
//                    maxIndex = subarrNo; // store subarray number
//                }
//                subarrNo++;
//            }
//        }
//
//        System.out.println("Maximum subarray sum is " + max);
//        System.out.println("It was found at subarray number " + maxIndex);
//
//        subarrNo = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (subarrNo == maxIndex) {
//                    System.out.print("Subarray with max sum: ");
//                    for (int k = i; k <= j; k++) {
//                        System.out.print(arr[k] + " ");
//                    }
//                    System.out.println();
//                    return; // done
//                }
//                subarrNo++;
//            }
//        }
//    }
//--------------
//    public static void maxSumvid(int arr[]) {
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){
//            int start = i;
//            for(int j = i; j < arr.length; j++){
//                int end = j;
//                currSum = 0;
//                for(int k = start; k <= end; k++){
//                    currSum += arr[k];
//                    if(maxSum < currSum){
//                        maxSum = currSum;
//                    }
//                }
//            }
//        }
//        System.out.println("max sum: " + maxSum);
//    }
//-------------------
//    public static void prefixSum(int arr[]) {
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        int prefix[] = new int[arr.length];
//        //int sum = 0;
//        //for (int i = 0; i < arr.length; i++) {
//        //   sum += arr[i];
//        //   prefix[i] = sum;
//        //}
//
//        prefix[0] = arr[0];
//        for (int i = 1; i < prefix.length; i++) {
//            prefix[i] = prefix[i-1] + arr[i];
//        }
//        for(int i = 0; i < arr.length; i++){
//            int start = i;
//            for(int j = i; j < arr.length; j++){
//                int end = j;
//
//                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // to prevent index fromm becoming -1 in case of start = 0;
//
//                if(maxSum < currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("max sum: " + maxSum);
//
//    }
//-------------------
//    public static void kadanes(int arr[]) {
//        int maxSum = Integer.MIN_VALUE;
//        int currSum = 0;
//        int maxElement = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            currSum += arr[i];
//            if (currSum < 0)
//                currSum = 0;
//            maxSum = Math.max(currSum, maxSum);
//            maxElement = Math.max(maxElement, arr[i]);
//        }
//
//        if(maxSum == 0){
//            maxSum = maxElement;
//        }
//
//        System.out.println("max sum of subarray = " + maxSum);
//    }

    public static void kadanes2(int arr[]) {
        int maxSum = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("max sum of subarray = " + maxSum);
    }



    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        //maxSum(arr);
        //maxSumSubarr(arr);
        //maxSumvid(arr);
        //prefixSum(arr);
        //kadanes2(arr);
    }
}
