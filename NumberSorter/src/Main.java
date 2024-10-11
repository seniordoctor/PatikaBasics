import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = input.nextInt();

        int temp;
        if (sayi1 < sayi2) {
            temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }
        if (sayi1 < sayi3) {
            temp = sayi1;
            sayi1 = sayi3;
            sayi3 = temp;
        }
        if (sayi2 < sayi3) {
            temp = sayi2;
            sayi2 = sayi3;
            sayi3 = temp;
        }

        System.out.println("Küçükten büyüğe sıralama: " + sayi3 + ", " + sayi2 + ", " + sayi1);
    }
}