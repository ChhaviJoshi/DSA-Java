package string;

public class LargestString {
    public static String compare(String [] str) {
        String largerStr = str[0];
        for (String s : str){
            for (int i = 0; i < s.length(); i++) {
                int largerStrVal = largerStr.charAt(i);
                int strVal = s.charAt(i);
                if( largerStrVal < strVal) {
                    largerStr = s;
                    break;
                }
            }
        }
        return largerStr;
    }

    public static void main(String[] args) {
        String [] fruits = {"apple", "mango", "papaya" , "banana"};

        //INBUILT:-  COMPLEXITY: 0(x*n) where x is num of elements in array
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);

        //MY LOGIC COMPLEXITY: O(n^2)
        System.out.println(compare(fruits));
    }
}


//A to Z - 65 to 90
//a to z - 97 to 122