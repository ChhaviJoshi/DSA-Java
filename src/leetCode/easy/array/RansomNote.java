package leetCode.easy.array;

import java.util.ArrayList;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            if(!list.contains(ransomNote.charAt(i))){
                return false;
            } else {
                list.remove(Character.valueOf(ransomNote.charAt(i)));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
