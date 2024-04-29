package Week1;

import java.util.Scanner;

public class ReverseStars {
    public static void main(String[] args) {

        //kullanıcıdan sayi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz: ");
        int num = scanner.nextInt();

        //ters üçgeni oluştur
        for (int i = num; i >= 1; i--) {
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
