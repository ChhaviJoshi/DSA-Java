package leetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedVowelByFreq {
    public static boolean isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }

    public static String sortVowels(String s) {
        Map<Character, Integer> map = new HashMap<>();

        List<Integer> index = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                index.add(i);
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            }
        }

        List<Character> list = map.entrySet().stream()
                .sorted((a,b) -> { if(!b.getValue().equals(a.getValue())) {
                    return b.getValue() - a.getValue();
                } return s.indexOf(a.getKey()) - s.indexOf(b.getKey()); })
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<Character> vowels = new ArrayList<>();

        for(char c : list) {
            int freq = map.get(c);
            for(int i = 0; i < freq; i++) {
                vowels.add(c);
            }
        }

        StringBuilder newS = new StringBuilder(s);
        int k = 0;

        for(int idx : index) {
            newS.setCharAt(idx, vowels.get(k));
            k++;
        }

        return newS.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(sortVowels(s));
    }
}
