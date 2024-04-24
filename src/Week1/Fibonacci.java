package Week1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();


        // ilk iki sayıyı tanımlıyoruz
        int first = 0;
        int second = 1;
        int total;

        // kullanıcıdan alınan sayı kadar döngüyü çalıştırıyoruz
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            total= first + second;
            first = second;
            second = total;
        }
    }
}
