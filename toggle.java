package string;

import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = " ";
        System.out.println("enter string");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                k = k + (char) (s.charAt(i) + 32);
            } else
                k = k + (char) (s.charAt(i) - 32);

        }
        System.out.println(k);

    }

}
