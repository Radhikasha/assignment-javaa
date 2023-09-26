package array;

import java.util.Scanner;

public class frequency_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String s = sc.next();
        s = s.toLowerCase();
        int a[] = new int[26];

        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 97]++;
        for (int i = 0; i < a.length; i++)
            if (a[i] > 0) {
                System.out.printf("%c = %d\n", i + 97, a[i]);

            }

    }

}
