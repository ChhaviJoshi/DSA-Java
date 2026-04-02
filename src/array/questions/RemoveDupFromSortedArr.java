package array.questions;

public class RemoveDupFromSortedArr {
    public static int removeDuplicates (int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if(temp[count] != arr[i]) {
                count++;
                temp[count] = arr[i];
            }
        }

        return count+1;
    }

    public static int removeDup (int[] arr) {
        int count = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[count] != arr[i]) {
                count++;
                arr[count] = arr[i];
            }
        }

        return count+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,3,4,4,5,5};
        System.out.println( removeDuplicates(arr));
        System.out.println( removeDup(arr));
    }
}
