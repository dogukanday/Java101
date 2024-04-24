package Week1;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args){
        int n, r;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        r = scanner.nextInt();

        if (n < r || n < 0 || r < 0) {
            System.out.println("Hatalı giriş!");
            return;
        }

        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        int nMinusRFactorial = 1;
        for (int i = 1; i <= n - r; i++) {
            nMinusRFactorial *= i;
        }

        int result = nFactorial / (rFactorial * nMinusRFactorial);
        System.out.println("C(" + n + ", " + r + ") = " + result);

    }
}
