package Week1;

import java.util.Scanner;

public class CastingNums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1;
        double num2;


        System.out.println("Bir tam sayı girin: ");
        num1 = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı girin: ");
        num2 = scanner.nextDouble();

        double numInt = (double) num1;
        int numDouble = (int) num2;

        System.out.println("Tam sayıyı ondalıklıya çevirme: " + numInt);
        System.out.println("Ondalıklı sayıyı tama çevirme: " + numDouble);
    }
}
