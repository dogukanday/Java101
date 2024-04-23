//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        System.out.println("Daire alan ve çevre hesaplama programı");
        Scanner input = new Scanner(System.in);
        //Verilerin alınması
        System.out.print("Yarıçapı giriniz: ");
        int r = input.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        int a = input.nextInt();

        //Alan ve çevrenin hesaplanması ve ekrana yazdırılması
        double pi = 3.14;
        double alan = (pi * (r * r) * a) / 360;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);


        }
    }
