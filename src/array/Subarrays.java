package array;

public class Subarrays {

    public static void printSubarrays(int arr[]){
        int totalsubarray = 0;
        int sumOfSubarray = 0;
        for(int a = 0; a < arr.length; a++){
            for(int b = a; b < arr.length; b++){
                for(int i = a; i <= b; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                totalsubarray++;
            }
            System.out.println();
        }
        System.out.println("total number of subarrays = " + totalsubarray);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        printSubarrays(a);
    }
}
