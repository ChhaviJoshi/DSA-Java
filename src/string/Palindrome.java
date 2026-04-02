package string;

public class Palindrome {
    public static boolean isPalindrome (String str) {
        for (int i = 0; i < str.length()/2; i++) {
            for (int j = str.length()-1; j > str.length()/2 ; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
    //but here complexity would be o(n^2)

    //BETTER SOLUTION
    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
            //we could've also written == conditon and returned true but this is better practice, though it doesn't do much difference
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(ispalindrome("madam"));
    }
}
