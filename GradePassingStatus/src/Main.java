import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        // Değişkenler
        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan notları alma
        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        // Ortalama hesaplama
        int toplam = (matematik + fizik + turkce + kimya + muzik);
        double ortalama = toplam / 5.0;

        // Ortalama yazdırma
        System.out.println("Ortalamanız: " + ortalama);

        if (ortalama >= 55 && ortalama <= 100) {
            System.out.println("Tebrikler, Sınıfı Geçtiniz!");
        } else if (ortalama < 55 && ortalama >= 0) {
            System.out.println("Sınıfta Kaldınız!");
        } else {
            System.out.println("Hatalı Not Girişi Yaptınız!");
        }
    }
}