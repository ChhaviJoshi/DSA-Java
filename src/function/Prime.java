package function;

public class Prime {
    public static boolean isPrime(int a){
        if(a<=1) return false;
        for (int i = 2; i*i <= a; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int a, int b){
        for (int i = a; i < b; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void checkPrimesInRange(int a, int b){
        for (int i = a; i < b; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        //System.out.println(isPrime(0));
        //primesInRange(50,70);
        checkPrimesInRange(50,70);
    }
}
