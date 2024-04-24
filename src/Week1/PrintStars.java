package Week1;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args){
        // kullanicidan alinan sayi kadar yildiz basacak
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz: ");
        int num = scanner.nextInt();

        // yildizlarin basildigi kisim
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k =1 ; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        // ters yildizlarin basildigi kisim
        for(int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
