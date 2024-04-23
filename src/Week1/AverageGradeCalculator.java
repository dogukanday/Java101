package Week1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Nor hesaplayıcıya Hoş geldiniz");
        Scanner scanner = new Scanner(System.in);

        // 1. Adım: Kullanıcıdan sayıları al
        int muzikNotu, matematikNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu;

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzikNotu = scanner.nextInt();

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematikNotu = scanner.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizikNotu = scanner.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimyaNotu = scanner.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkceNotu = scanner.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarihNotu = scanner.nextInt();

        // 2. Adım: Ortalamayı hesapla

        double ortalama = (muzikNotu + matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu) / 6.0;
        System.out.println("Ortalamanız: " + ortalama);

        // 3. Adım: Ortalamaya göre karar ver
        switch (ortalama >= 60 ? 1 : 0) {
            case 1:
                System.out.println("Sınıfı Geçtiniz. Tebrikler!");
                break;
            case 0:
                System.out.println("Sınıfta Kaldınız. Üzgünüm!");
                break;
        }
    }
}