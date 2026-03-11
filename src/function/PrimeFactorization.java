package function;

public class PrimeFactorization {

    public static void primefactors(int n){
        while(n!=1){
            for (int i = 2; i <= n; i++) {
                    while(n % i == 0){
                        n /= i;
                        System.out.println(i);
                    }
            }
        }
    }

    void primeFactorsOptimal(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) System.out.print(n);
    }

    public static void main(String[] args) {
        primefactors(120);
    }
}
