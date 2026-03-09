package array;

public class RevArray {
    public static void rev(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int c;

        while(start < end){
            c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        rev(a);
        for( int n: a){
            System.out.print(n);
        }
    }
}
