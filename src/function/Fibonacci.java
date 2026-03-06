package function;

public class Fibonacci {
    public static void fibonacciUsingLoop(int n){
        int first = 0;
        int second = 1;
        int next = first + second;

        for(int i = 1; i <= n; i++){
            if(i == 1)
                System.out.print(first + " ");
            else if(i == 2)
                System.out.print(second + " ");
            else if(i == 3)
                System.out.print(next + " ");
            else {
                first = second;
                second = next;
                next = first + second;
                System.out.print(next + " ");
            }
        }
    }

    public static int fibonacciUsingRecursion(int n){
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return(fibonacciUsingRecursion(n-1)+ fibonacciUsingRecursion(n-2));
    }

    public static void main(String[] args) {
        //fibonacciUsingLoop(17);
        //System.out.println(fibonacciUsingRecursion(5)); //prints only nth no.

        int n = 10; // print first 10 Fibonacci numbers
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacciUsingRecursion(i) + " ");
        }

    }
}
