package Week1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("KDV hesaplama programına hoşgeldiniz.");
        Scanner input = new Scanner(System.in);


        // Kullanıcıdan tutari isteme.
        System.out.print("Lütfen bir sayı giriniz: ");
        double tutar = input.nextDouble();


        // KDV hesaplama işlemi
        if(tutar > 0 && tutar <= 1000){
            double kdv = tutar * 0.18;
            double kdvliTutar = tutar + kdv;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV'li tutar: " + kdvliTutar);
            System.out.println("KDV tutarı: " + kdv);

        }else if(tutar > 1000){
            double kdv = tutar * 0.08;
            double kdvliTutar = tutar + kdv;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV'li tutar: " + kdvliTutar);
            System.out.println("KDV tutarı: " + kdv);

        }
        else if(tutar<= 0){
            System.out.println("Lütfen 0'dan büyük bir sayı giriniz.");
        }
    }
}