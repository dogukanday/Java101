package Week1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class GroceryCalculator {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        System.out.println("Manav`a Hosgeldiniz");
        double armut= 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kilo bilgilerinin alınması.

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = input.nextDouble();

        //Toplam tutarın hesaplanması.

        double toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam Tutar : " + toplam + " TL");

        }
    }
