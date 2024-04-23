package Week1;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kaç adet sayı gireceğini al
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Geçersiz giriş!");
            return;
        }

        int[] numbers = new int[n];

        // Sayıları al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
        }

        // En küçük ve en büyük sayıları bul
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Sonuçları yazdır
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        scanner.close();
    }
}
