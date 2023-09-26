package assignment;

import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        float c;
        c = ((f - 32) * 5) / 9;
        System.out.println("temperature in celsius is: " + c);

    }

}
