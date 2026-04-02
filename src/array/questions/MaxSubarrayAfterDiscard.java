package array.questions;

public class MaxSubarrayAfterDiscard {

    public static int maxSubarray(int[] arr) {
        int discard = 0;

        for (int j : arr) {
            if (j < discard) {
                discard = j;
            }
        }

        int[] updatedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == discard){
                updatedArr[i] = 0;
            } else {
                updatedArr[i] = arr[i];
            }
        }

        int[] prefix = new int[arr.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += updatedArr[i];
            prefix[i] = currSum;
        }

        for (int i = 0; i < prefix.length; i++) {
            if(maxSum < prefix[i]) {
                maxSum = prefix[i];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 1, 4, -1};
        System.out.println(maxSubarray(arr));
    }
}
