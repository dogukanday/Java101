package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi büyüklüğünü yazınız: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Dizinin elemanlarını yazınız:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        Arrays.sort(array);


        System.out.println("Sıralandı :");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
