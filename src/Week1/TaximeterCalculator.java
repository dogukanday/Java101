package Week1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        System.out.println("Taksi metre hesaplayıcıya hoşgeldiniz.");
        int km,acilisUcreti=10;
        double kmUcreti=2.20;
        double toplamUcret;

        //kullanıcıdan veri alındı ve hatalı veri girişleri kontrol edildi
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        if (km<0){
            System.out.println("Lütfen pozitif bir değer giriniz.");
            return;
        }


        //hesaplama yapıldı ve sonuç ekrana yazdırıldı
        toplamUcret = acilisUcreti + (km * kmUcreti);
        if (toplamUcret < 20 && toplamUcret>0) {
            System.out.println("Ödemeniz gereken tutar: 20 TL");
        } else {
            System.out.println("Ödemeniz gereken tutar: " + toplamUcret + " TL");
        }
    }
}