package Week1;

import java.util.Scanner;

public class AdditionOfDigits {
    public static void main(String[] args) {
        // kullanicidan sayilarin alinmasi
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        number = scanner.nextInt();


        // sayinin basamaklarinin toplanmasi
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Basamakların Toplamı " + sum);
    }
}
