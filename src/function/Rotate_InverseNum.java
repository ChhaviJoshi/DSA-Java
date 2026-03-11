package function;

public class Rotate_InverseNum {
    public static void rotateNum(int n, int rotation){
        int temp = n;
        int count = 0;
        while(temp > 0){
            temp /= 10;
            count++;
        }

        for (int i = 0; i < rotation; i++) {
            int lastdig = n % 10;
            n /= 10;
            n += lastdig * (int) Math.pow(10, count - 1);
            System.out.println(n);
        }
    }

    public static int rotateRightOptimal(int num, int rot) {
        String s = String.valueOf(num);
        int len = s.length();  //instead of making a separate count loop we directly calculated length by converting it into string
        rot = rot % len;
        int divisor = (int)Math.pow(10, rot);
        int right = num % divisor;
        int left = num / divisor;
        return right * (int)Math.pow(10, len - rot) + left;
    }

    public static void main(String[] args) {

        rotateNum(12345, 3);
        System.out.println(rotateRightOptimal(12345, 3));
    }
}
