package Week2;

public class RepeatedNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 6, 8, 4, 6, 10, 12, 3, 5, 7, 8, 2, 5};


        boolean[] seen = new boolean[101];
        boolean[] duplicates = new boolean[101];

        for (int number : numbers) {
            if (number % 2 == 0) {
                if (seen[number]) {
                    duplicates[number] = true;
                }
                seen[number] = true;
            }
        }

        // Print duplicate even numbers
        boolean found = false;
        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < duplicates.length; i++) {
            if (duplicates[i]) {
                found = true;
                System.out.println(i);
            }
        }

        if (!found) {
            System.out.println("Bulunamadı.");
        }
    }
}
