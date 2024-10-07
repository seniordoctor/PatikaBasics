import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        double perKm = 2.20;
        double minPrice = 20.0;
        double startPrice = 10.0;

        // Mesafe ücretlendirmesi
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double distance = input.nextDouble();

        // Hesaplama
        double total = startPrice + (distance * perKm);

        // Minimum ücret kontrolü
        total = total < 20.0 ? 20.0 : total;

        // Sonuç
        System.out.println("Toplam Tutar: " + total);

    }
}