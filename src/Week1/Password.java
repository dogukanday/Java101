package Week1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String kullaniciadi = "admin";
        String sifre = "1234";

        // Kullanıcıdan kullanıcı adı ve şifre alınıp kontrol edilecek
        System.out.println("Kullanıcı Adı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdiGirilen = scanner.nextLine();


        if(kullaniciAdiGirilen.equals(kullaniciadi)){
            System.out.println("Şifre giriniz: ");
            String sifreGirilen = scanner.nextLine();
            if(sifreGirilen.equals(sifre)){
                System.out.println("Giriş başarılı");
            }

            // Şifre yanlışsa şifre sıfırlama işlemi yapılacak
            else{
                System.out.println("Şifre hatalı, tekrar deneyiniz yada şiifrenizi sıfırlamak için 1 seçiniz");
                int secim = scanner.nextInt();
                scanner.nextLine();
                if(secim == 1){
                    System.out.println("Yeni şifrenizi giriniz: ");
                    String yeniSifre = scanner.nextLine();
                    if (!yeniSifre.equals(sifre)){
                        sifre = yeniSifre;
                        System.out.println("Şifre değiştirildi");
                    }else{
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                }
            }
        }
    }
}