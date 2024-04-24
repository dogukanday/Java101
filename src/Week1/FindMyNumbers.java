package Week1;

import java.util.Scanner;

public class FindMyNumbers {
    public static void main(String[] args){
        int num, sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Bir sayı girin: ");
            num = scanner.nextInt();
            if (num % 2 == 0 && num % 4==0){
                sum += num;
            }
        } while (num % 2 ==0);

        System.out.println("Toplam: " + sum);

    }
}
