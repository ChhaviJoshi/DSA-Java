package function;

public class Recursion {
    //LOGIC:
    //-mention base condition until which we need to repeat
    //-call the function itself
    //-when base condition reached recursion stops

    public static int factorial(int n){
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

//    public static void printHi (int n, int i) {
//        if (n == 0) {
//            break;
//        } else {
//            System.out.println("Hi");
//            printHi(n - 1, i);
//        }
//    }

    public static void main(String[] args) {
        System.out.println(factorial(8));
    }
}
