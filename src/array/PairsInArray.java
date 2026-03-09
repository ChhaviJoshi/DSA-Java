package array;

public class PairsInArray {
    public static void pairsInArr(int arr[]){
        int a = 0; //both a and b can be directly declared in the loop as well
        int b;

        while(a < arr.length - 1) {
            for (b = a + 1; b < arr.length; b++) {
                System.out.print("( " + arr[a] + ", " + arr[b] + " )");
            }
            a++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        pairsInArr(a);
    }
}
