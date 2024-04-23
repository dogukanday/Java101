//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        System.out.println("Üçgen alan hesabına hoşgeldiniz.");
        Scanner scanner = new Scanner(System.in);

        // Üçgenin kenarlarını kullanıcıdan alıyoruz.
        System.out.print("1.uzunluğunu giriniz: ");
        int a = scanner.nextInt();
        System.out.print("2.uzunluğunu giriniz: ");
        int b = scanner.nextInt();
        System.out.print("3.uzunluğunu giriniz: ");
        int c = scanner.nextInt();


        // Üçgenin alanını hesaplıyoruz ve ekrana yazdırıyoruz.
        int u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        if (alan == 0) {
            System.out.println("Üçgen oluşturulamaz.");
        } else {
            System.out.println("Üçgenin alanı: " + alan);
        }
    }
}