package Week2;

import java.util.Scanner;

public class PrimeNumbersWithMethod {

    static boolean isPrime(int number,int base) {
        if (number <= 2)
            return number == 2;
        if (number % base == 0)
            return false;
        if (base * base > number)
            return true;

        return isPrime(number, base + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();
        if(isPrime(num,2)){
            System.out.println(num + " asal bir sayıdır.");
        }else{
            System.out.println(num + " asal bir sayı değildir.");
        }
    }
}
