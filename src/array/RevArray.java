package array;

public class RevArray {
    public static void rev(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        rev(a);
        for( int n: a){
            System.out.print(n);
        }
    }
}
