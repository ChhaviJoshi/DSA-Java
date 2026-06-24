package leetCode.easy.string;

public class BinaryAddition {
    public  static String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(m >= 0 || n >= 0 || carry == 1) {
            int sum = carry;

            if(m >= 0) {
                sum += a.charAt(m) - '0';
                m--;
            }

            if(n >= 0) {
                sum += b.charAt(n) - '0';
                n--;
            }

            ans.append(sum % 2);
            carry = sum/2;
        }
        return ans.reverse().toString();
    }


}
