package function;

public class BinomialCoefficient {

    public static int factorial(int n){
        int a = 1;
        for(int i = 1; i <= n; i++){
            a = a * i;
        }
        return a;
    }

    public static float binocoeff(int n, int r){
        float bino = (float)(factorial(n)/(factorial(r)*factorial(n-r)));
        return bino;
    }

    public static void main(String[] args) {
        System.out.println(binocoeff(5, 4));
    }
}
