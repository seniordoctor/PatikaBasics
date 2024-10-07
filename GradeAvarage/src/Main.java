import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        double mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner ile değer ataması yapacağız
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri alacağız
        System.out.print("Matematik Notunuz: ");
        mat = input.nextDouble();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextDouble();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();

        // Ortalama hesaplaması
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        // Sonucun yazdırılması
        System.out.println("Ortalamanız: " + ortalama);

        // Durumun kontrolü
        boolean durum = ortalama >= 60;
        System.out.println("Durum: " + (durum ? "Geçti" : "Kaldı"));
    }
}