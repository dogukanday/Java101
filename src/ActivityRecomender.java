import java.util.Scanner;

public class ActivityRecomender {
    public static void main(String[] args){
        System.out.println("Hava sıcaklığı kaç derece?");

        // Kullanıcıdan sıcaklık bilgisini alalım
        Scanner scanner = new Scanner(System.in);
        int heat = scanner.nextInt();

        // Hava sıcaklığına göre yapılacak aktiviteyi belirleyelim
        String activity = heat > 25 ? "Yüzmeye gidebilirsiniz." : heat >= 5 && heat <= 25 ? heat <= 15 ? "Sinemaya gidebilirsiniz." : "Pikniğe gidebilirsiniz." : "Kayak yapabilirsiniz.";

        // Aktiviteyi ekrana yazdıralım
        System.out.println(activity);
    }
}
