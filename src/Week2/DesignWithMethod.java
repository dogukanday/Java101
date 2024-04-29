package Week2;

import java.util.Scanner;

public class DesignWithMethod {

    static void doIt(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        do {
            System.out.print(n + " ");
            doIt(n - 5);
            System.out.print(n + " ");
            break;
        }while(n<=0);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        doIt(num);
    }
}
