package string;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        name = sc.next();
        System.out.println(name);

        //Concatination
        String firstname = "Chhavi";
        String lastname = "Joshi";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
    }
}
