package Week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        //kullanicidan veri alindi
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı girin: ");

        int number = scanner.nextInt();

        // girilen sayinin mukemmel sayi olup olmadigini kontrol eden kod
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        // girilen sayinin mukemmel sayi olup olmadigini ekrana yazdiran kod
        if (total == number) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
