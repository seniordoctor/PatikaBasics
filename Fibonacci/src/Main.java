import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fibonacci serisi, eleman sayısını kullanıcıdan al
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}