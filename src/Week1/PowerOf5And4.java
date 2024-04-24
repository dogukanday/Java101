package Week1;

import java.util.Scanner;

public class PowerOf5And4 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i*=4){
            System.out.println(i + " 4 kuvvetidir.");
        }

        for(int i = 1; i <= n; i*=5){
            System.out.println(i + " 5 kuvvetidir.");
        }
    }
}
