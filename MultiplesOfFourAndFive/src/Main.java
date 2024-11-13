import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("4 ve 5'in kuvveti: " + i);
            }
        }
    }
}