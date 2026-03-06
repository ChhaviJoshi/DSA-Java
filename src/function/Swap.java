package function;

public class Swap {

    public static void swapUsing3var(int a, int b){
        System.out.println("== before swapping ==");
        System.out.println("first number : " + a);
        System.out.println("second number : " + b);
        int c = a;
        a = b;
        b = c;

        System.out.println("== after swapping ==");
        System.out.println("first number : " + a);
        System.out.println("second number : " + b);
    }

    public static void swap(int a, int b){
        System.out.println("== before swapping ==");
        System.out.println("first number : " + a);
        System.out.println("second number : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("== after swapping ==");
        System.out.println("first number : " + a);
        System.out.println("second number : " + b);
    }

    public static void main(String[] args) {
        //swapUsing3var(2,3);
        swap(2,5);
    }
}
