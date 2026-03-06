package function;

public class Digit {
    public static int countDig(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static void revNum(int n){
        while(n != 0){
            System.out.print(n % 10);
            n /= 10;
        }
    }

    public static void printDig(int n){
        int count = countDig(n) - 1;
        while(n != 0){
            int denominator = (int)(Math.pow(10, count));
            int dig = n / denominator;
            System.out.println(dig);
            count --;
            n = n - (dig * denominator);
        }
    }

    public static void printDigUsingStr(int n){
        String numStr = String.valueOf(n); //provides string representation of int value
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(numStr.charAt(i));
        }
    }

    public static void printDigsUsingDivisor(int n){
        int divisor = 1;
        while(n/divisor > 0){ // n/div not n/10!
            divisor *= 10;
        }
        while(divisor > 0){    //div>0 not n>0!
            int dig = n / divisor;
            System.out.println(dig);
            n = n % divisor;
            divisor /= 10;
        }
    }

    public static void main(String[] args) {
        //System.out.println(countDig(4531));
        //revNum(431);
        //printDig(431);
        //printDigUsingStr(431);
        printDigsUsingDivisor(431);
    }
}
