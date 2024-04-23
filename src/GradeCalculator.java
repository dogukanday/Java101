import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();

        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.println("Lütfen türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        if (matematik < 0 || matematik > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz not girdiniz, lütfen notlarınızı kontrol ediniz.");
            return;
        }else {
            double average = (matematik + fizik + kimya + turkce + muzik) / 5.0;
            System.out.println("Ortalamanız: " + average);
            if (average >= 55) {
                System.out.println("Sınıfı geçtiniz.");
            }else {
                System.out.println("Sınıfta kaldınız.");
            }
        }

    }
}
