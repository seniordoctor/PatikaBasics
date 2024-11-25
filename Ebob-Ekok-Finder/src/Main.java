import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ebob ve Ekok bulan program yaz

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}