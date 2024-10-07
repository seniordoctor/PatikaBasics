import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);
        // Değerler
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz: ");
        height = input.nextDouble();

        // BMI Hesaplama
        bmi = weight / (height * height);

        // BMI Sonucu
        System.out.println("Vücut Kitle İndeksiniz: " + bmi);

        // BMI Durumları
        if (bmi < 18.5) {
            System.out.println("Zayıf");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("Fazla Kilolu");
        } else if (bmi >= 29.9 && bmi < 34.9) {
            System.out.println("Obez");
        } else if (bmi >= 34.9 && bmi < 40) {
            System.out.println("Aşırı Obez");
        } else {
            System.out.println("Aşırı Şişman (Morbid Obez)");
        }
    }
}