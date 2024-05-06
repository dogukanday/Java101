package Week2;

import java.util.Scanner;

public class FrequencyOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi büyüklüğünü yazınız: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Dizinin elemanlarını yazınız:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate frequencies
        int[] frequencies = new int[101]; // Assuming numbers are between 0 and 100

        for (int num : array) {
            frequencies[num]++;
        }

        // Print frequencies
        System.out.println("Sayıların Frekansı:");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println(i + " : " + frequencies[i]);
            }
        }
    }
}
