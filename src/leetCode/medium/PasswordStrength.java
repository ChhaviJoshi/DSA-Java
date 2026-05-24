package leetCode.medium;

import java.util.HashSet;

public class PasswordStrength {
    public static int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        int strength = 0;

        for(int i = 0; i < password.length(); i++) {
            if(!set.contains(password.charAt(i))) {
                set.add(password.charAt(i));
                if(Character.isLowerCase(password.charAt(i))) {
                    strength +=1;
                } else if(Character.isUpperCase(password.charAt(i))) {
                    strength +=2;
                } else if(Character.isDigit(password.charAt(i))) {
                    strength +=3;
                } else if(!Character.isLetterOrDigit(password.charAt(i))) {
                    strength +=5;
                }
            } else {
                continue;
            }
        }
        return strength;
    }

    public static void main(String[] args) {
        System.out.println(passwordStrength("aA1!"));
        System.out.println(passwordStrength("aaA1!"));
    }
}
