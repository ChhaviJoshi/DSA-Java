package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public static String[] encode1(List<String> strs) {
        String[] arr = new String[strs.size()];
        for(int i = 0; i < strs.size(); i++) {
            String encoded = "";
            for(int j = 0; j < strs.get(i).length(); j++) {
                encoded += (int)strs.get(i).charAt(j) + " ";
            }
            arr[i] = encoded.trim();
        }
        return arr;
    }

    public static List<String> decode1(String[] str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            String decoded = "";
            for (int j = 0; j < str[i].length(); j++) {
                int ascii = 0;
                String decodedInt = "";
                while(j < str[i].length() && str[i].charAt(j) != ' ') {
                    decodedInt += str[i].charAt(j);
                    j++;
                }
                ascii = Integer.parseInt(decodedInt);
                decoded += (char)ascii;
            }
            list.add(decoded);
        }
        return list;
    }

    //actual sollution under given constraints
    public static String encode(List<String> str) {
        String encode = "";
        for(int i = 0; i < str.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < str.get(i).length(); j++) {
                sb.append(str.get(i).charAt(j));
            }
            encode += "#" + str.get(i).length() + sb;
        }
        return encode;
    }

    public static String encodeOptimal(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(s.length())
                    .append("#")
                    .append(s);
        }
        return sb.toString();
    }

    public static List<String> decodeOptimal(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1, j+1+length);
            decoded.add(word);
            i = 1 + j + length;
        }
        return decoded;
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Hello", "World!");
        System.out.println(encodeOptimal(strs));
        System.out.println((decodeOptimal(encodeOptimal(strs))));
    }
}
