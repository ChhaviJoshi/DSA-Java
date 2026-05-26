package leetCode.easy;

import java.util.HashSet;

public class NumberOfSpecialChar {
    public static int numberOfSpecialChars(String word) {
        int count = 0;

        HashSet<Character> setL = new HashSet<>();
        HashSet<Character> setU = new HashSet<>();

        for(int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))) {
                setL.add(word.charAt(i));
            } else {
                setU.add(word.charAt(i));
            }
        }

        for(char c : setU){
            if(setL.contains(Character.toUpperCase(c))) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("aaAbcB"));
    }
}
