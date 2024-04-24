package Week1;

public class PrimeNumbers {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan sayilardan asal olanlari bulan program
        int number = 100;
        for (int i = 2; i <= number; i++) {
            int counter = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                System.out.println(i);
            }
        }
    }
}
