package Week1;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {

        //verilerin tanımlanması
        Scanner scanner = new Scanner(System.in);
        int choice;
        double balance = 1000.0;
        double amount;
        int attempt = 3;
        String username = "admin";
        String password = "1234";


        System.out.println("ATM'ye Hoşgeldiniz!");

        System.out.println("Lütfen işlem yapmak için giriş yapınız.");


        //kullanıcı adı ve şifre girişi
        System.out.print("Kullanıcı adınızı giriniz: ");
        String enteredUsername = scanner.next();
        System.out.print("Şifrenizi giriniz: ");
        String enteredPassword = scanner.next();

        //kullanıcı adı ve şifre kontrolü

        while (attempt > 1 && (!enteredUsername.equals(username) || !enteredPassword.equals(password))) {
            System.out.println("Kullanıcı adı veya şifre hatalı! Tekrar deneyiniz.");
            System.out.print("Kullanıcı adınızı giriniz: ");
            enteredUsername = scanner.next();
            System.out.print("Şifrenizi giriniz: ");
            enteredPassword = scanner.next();
            attempt--;

            if(attempt == 1){
                System.out.println("Hesabınız bloke oldu. Lütfen bankanızla iletişime geçiniz.");
                break;
            }
        }

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Giriş başarılı!");


            //işlem seçenekleri ve işlemler
            do {
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                System.out.println("1-Para Çekme\n" +
                        "2-Para Yatırma\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                        amount = scanner.nextDouble();
                        if (amount > balance) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            balance -= amount;
                            System.out.println("Yeni bakiyeniz: " + balance);
                        }
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                        amount = scanner.nextDouble();
                        balance += amount;
                        System.out.println("Yeni bakiyeniz: " + balance);
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    case 4:
                        System.out.println("Hesaptan çıkış yapılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz işlem!");
                        break;
                }
            } while (choice != 4);
        }else {

            System.out.println("Kullanıcı adı veya şifre hatalı!");
        }

    }
}
