package function;

public class Functions {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                count ++;
                break;
            }
        }
        if(count > 0)
            return false;
        else
            return true;
    }

    public static void primeInRange(int a, int b){
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static int binaryToDecimal(int n){
        int power = 0;
        int decimalval = 0;
        while(n > 0){
            int lastDig = n % 10;
            decimalval = decimalval + lastDig * (int)(Math.pow(2,power));
            power++;
            n /= 10;
        }
        return decimalval;
    }

    public static int decimalToBinary(int n){
        int power = 0;
        int binaryval = 0;
        while(n > 0){
            int num = n % 2;
            binaryval += num * (int)(Math.pow(10,power));
            n /= 2;
        }
        return binaryval;
    }

    public static void main(String[] args) {
        //System.out.println(isPrime(12));
        //primeInRange(1,20);
        //System.out.println(binaryToDecimal(101));
        System.out.println(decimalToBinary(10));
    }
}
