package leetCode.medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int multiply(int[] nums, int n) {
        int m = 1;
        for(int i = 0; i < nums.length; i++) {
            if(i == n) {
                continue;
            }
            m *= nums[i];
        }
        return m;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = multiply(nums, i);
        }
        return arr;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] arr = new int[nums.length];

        int totalProd = 1;
        for(int i = 0; i < arr.length; i++) {
            totalProd *= nums[i];
        }

        for(int i = 0; i < arr.length; i++) {
            try{
                arr[i] = totalProd/nums[i];
                //gives dividion by zero error
            } catch(ArithmeticException e) {
                System.out.println("zero division");
            }
        }

        return arr;
    }

    public static int[] productExceptSelf3(int[] nums) {
        int[] arr = new int[nums.length];

        arr[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }

        int rightProd = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= rightProd;
            rightProd *= nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
        System.out.println(Arrays.toString(productExceptSelf3(nums)));
    }
}
