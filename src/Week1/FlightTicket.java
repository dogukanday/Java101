package Week1;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        int age, km, type;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        type = scanner.nextInt();

        double ticketPrice = km * 0.10;

        if (km < 0 || age < 0 || (type != 1 && type != 2)) {
            System.out.println("Hatalı veri girdiniz.");
        } else {
            if (age < 12) {
                ticketPrice *= 0.5;
            } else if (age >= 12 && age <= 24) {
                ticketPrice *= 0.9;
            } else if (age > 65) {
                ticketPrice *= 0.7;
            }

            if (type == 2) {
                ticketPrice *= 0.8;
                ticketPrice *= 2;
            }

            System.out.println("Toplam Tutar: " + ticketPrice + " TL");
        }

    }
}
