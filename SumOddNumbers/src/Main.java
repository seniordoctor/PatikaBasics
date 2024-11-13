import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

        Scanner scan = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            number = scan.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);

        System.out.println("Toplam: " + total);

    }
}