package Week1;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı alın
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        num = scanner.nextInt();

        double sum = 0.0;


        // sayıya kadar olan harmonik sayıları topla
        for (int i = 1; i <= num; i++) {
            sum += 1.0 / i;
        }
        // toplamı yazdır
        System.out.println("Harmonik sayılar toplamı: " + sum);

        scanner.close();
    }
}
