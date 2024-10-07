import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Meyve ve KG fiyatları
        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlicanKgFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan alınan veriler
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();

        double toplamTutar = (armutKg * armutKgFiyat) + (elmaKg * elmaKgFiyat) + (domatesKg * domatesKgFiyat) + (muzKg * muzKgFiyat) + (patlicanKg * patlicanKgFiyat);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}