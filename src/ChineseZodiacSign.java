import java.util.Scanner;

public class ChineseZodiacSign {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        year = scanner.nextInt();
        scanner.close();

        String[] chineseZodiacSigns = {
            "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
            "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };
        System.out.println("Çin Zodyağı Burcunuz : " + chineseZodiacSigns[year % 12]);
    }
}
