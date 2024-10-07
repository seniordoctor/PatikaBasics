import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        double pi = 3.14;
        double r, area, circumference;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri alınması
        System.out.print("Yarıçapı giriniz: ");
        r = scanner.nextDouble();

        // Alan ve çevre hesaplaması
        area = pi * r * r;
        circumference = 2 * pi * r;

        // Sonucun ekrana yazdırılması
        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin çevresi: " + circumference);

        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        double alpha, sliceArea;

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        alpha = scanner.nextDouble();

        sliceArea = (alpha / 360) * pi * r * r;

        System.out.println("Daire diliminin alanı: " + sliceArea);
        
    }
}