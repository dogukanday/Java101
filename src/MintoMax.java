import java.util.Scanner;

public class MintoMax {
    public static void main(String[] args) {
        int[] numbers = {};
        Scanner scanner = new Scanner(System.in);
        numbers = new int[3];
        System.out.println("Sayıları giriniz: ");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
