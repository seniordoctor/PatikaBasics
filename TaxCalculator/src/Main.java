import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        double tutar, kdvOran = 0.18, kdvTutar;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan veri alınması
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        // KDV hesaplama
        kdvTutar = tutar * kdvOran;

        // KDV'li ve KDV'siz tutarların ekrana yazdırılması
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV'li tutar: " + (tutar + kdvTutar));
        System.out.println("KDV tutarı: " + kdvTutar);
    }
}