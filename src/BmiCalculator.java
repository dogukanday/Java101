//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        System.out.println("Vücut Kitle Endeksi Hesaplama Programına Hoşgeldiniz!");
        Scanner scanner = new Scanner(System.in);


        // kullanıcıdan verilerin alınması
        System.out.println("Kilonuzu (KG) cinsinden giriniz:");
        double weight = scanner.nextDouble();

        System.out.println("Boyunuzu (CM) cinsinden giriniz: ");
        double height = scanner.nextDouble();


        // vki hesaplama
        double bmi = weight / Math.pow(height / 100, 2);
        
        //vki yuvarlama
        double roundedBmi = Math.round(bmi * 100.0) / 100.0;


        // vki sonucu ve durumunun yazdırılması
        System.out.println("Your BMI is: " + roundedBmi);
        if (bmi < 18.5) {
            System.out.println("Zayıfsınız");
        } else if (bmi < 25) {
            System.out.println("Normalsiniz");
        } else if (bmi < 30) {
            System.out.println("Fazla Kilolusunuz");
        } else {
            System.out.println("Obezsiniz");
        }
    }
}
