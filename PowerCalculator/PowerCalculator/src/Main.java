import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int us = scan.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuç: " + sonuc);
        
    }
}