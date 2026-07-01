package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LonelyNumber {
    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> arr) {
        ArrayList<Integer> lonely = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int n : arr) {
            if(!set.contains(n)) {
                set.add(n);
            } else {
                duplicate.add(n);
            }
        }

        for(int n : arr) {
            if(!duplicate.contains(n) && !(set.contains(n - 1) || set.contains(n + 1))) {
                lonely.add(n);
            }
        }
        return lonely;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonelyNumber(list));
    }
}
