import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl bilgisini alıyoruz.
        System.out.println("Lütfen bir yıl giriniz: ");
        year = scanner.nextInt();


        // Artık yıl hesaplama işlemi
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır.");
                }else {
                    System.out.println(year + " bir artık yıl değildir.");
                }
            }else {
                System.out.println(year + " bir artık yıldır.");
            }
        }else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
