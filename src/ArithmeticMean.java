//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A sayısını giriniz :");
        int a = scanner.nextInt();
        System.out.println("B sayısını giriniz :");
        int b = scanner.nextInt();
        System.out.println("C sayısını giriniz :");
        int c = scanner.nextInt();

        int result = a + (b * c) - b;
        System.out.println(result);
        }
    }
