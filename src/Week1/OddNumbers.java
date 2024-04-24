package Week1;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int n, sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        n = scanner.nextInt();

        for (int i = 1; i<=n ; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Bu aralıkta böyle bir sayı yok.");
        } else {
            double average = (double) sum / count;
            System.out.println("Ortalama: " + average);
        }

    }
}
