package Week1;

import java.util.Scanner;

public class LeastAndLowestCommonFactor {
    public static void main(String[] args) {

        //kullanicidan iki sayi alalim
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        scanner.close();


        // EBOB hesaplama
        int ebob = 1;
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }

        // EKOK hesaplama
        int ekok = (num1 * num2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }
    }

