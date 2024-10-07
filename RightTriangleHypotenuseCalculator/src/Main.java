import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        a^2 + b^2 = c^2
        */

        // Değişkenlerin tanımlanması
        int a, b;
        double c, u, alan;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan veri alınması
        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Hipotenüs: " + c);
        System.out.println("Üçgenin Alanı: " + alan);
    }
}