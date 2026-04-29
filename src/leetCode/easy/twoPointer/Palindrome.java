package leetCode.easy.twoPointer;


public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean isTrue = true;
        //if (s.equals(" ")) return isTrue;

        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) continue;
            newS += s.charAt(i);
        }

        newS = newS.toLowerCase();

        int left = 0;
        int right = newS.length() - 1;

        while (left <= right) {
            if (newS.charAt(left) != newS.charAt(right)) {
                isTrue = false;
            }
            left++;
            right--;
        }

        return isTrue;
    }

    public static boolean isPalindromeOptimal(String s) {
        boolean isTrue = true;


        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (!(Character.isLetterOrDigit(s.charAt(left)) || (Character.isLetterOrDigit(s.charAt(right))))) {
                if (s.charAt(left) != s.charAt(right)) {
                    isTrue = false;
                }
                left++;
                right--;
            }
        }
        return isTrue;
    }

        public static void main (String[]args){
            String s = "A man, a plan, a canal: Panama";
            String s1 = "0p";
            String s2 = "a.";
            System.out.println(isPalindrome(s2));
        }
    }