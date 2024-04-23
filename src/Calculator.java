import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Hesap makinesine hoşgeldiniz");

        System.out.println("Lütfen işlem yapmak istediğiniz sayıları giriniz");

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alıp ve istenilen işlemi seçme
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
        String islem = scanner.next();


        // Girilen işleme göre işlem yapma ve sonucu ekrana yazdırma
        switch (islem) {
            case "+":
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("Fark: " + (sayi1 - sayi2));
                break;
            case "*":
                System.out.println("Çarpım: " + (sayi1 * sayi2));
                break;
            case "/":
                System.out.println("Bölüm: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Geçersiz işlem");
        }

    }
}