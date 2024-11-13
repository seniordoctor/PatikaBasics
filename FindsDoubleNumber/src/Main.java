import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int total = 0;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.print("Bu aralıkta 3 ve 4'e tam bölünen sayı bulunmamaktadır.");
        } else {
            System.out.print("Ortalama: " + total / count);
        }
    }
}