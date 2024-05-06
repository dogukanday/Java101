package Week2;

import java.util.Scanner;

public class ArrayMinAndMax {
    public static void main(String[] args) {
        int[] list = {43, 26, 12, 1, 10, -22, -43 , -5, -7};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value :  ");
        int value = input.nextInt();
        int nearestMin = Integer.MIN_VALUE;
        int nearestMax = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < value && i > nearestMin) {
                nearestMin = i;
            }
            if (i > value && i < nearestMax) {
                nearestMax= i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestMin );
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestMax);
    }
}
