package Week2;

import java.util.Scanner;

public class RecursivePower {

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int base = input.nextInt();
        System.out.print("Üs değerini girin: ");
        int exponent = input.nextInt();
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}
