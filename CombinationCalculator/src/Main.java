import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir. Java ile kombinasyon hesaplayan program
        C(n,r) = n! / (r! * (n-r)!) formülü kullanılır.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel Sayısı: ");
        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        System.out.println("Faktoriyel Sonucu: " + total);
    }
}