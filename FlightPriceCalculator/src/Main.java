import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mesafe (KM), yolcu yaşı, yolcu tipi(Tek Yön, Gidiş-Dönüş)
        // 0.10 TL per KM

        int passengerAge, tripType;
        double distance, basePrice, priceForKids, priceForChildren, priceForElders, totalPrice = 0, tempPrice = 0, pricePerKm = 0.10;

        // Yolcudan gerekli bilgileri alalım ve kontrol edelim.
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        distance = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        passengerAge = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        tripType = input.nextInt();

        if (distance <= 0 || tripType <= 0 || tripType <= 0) {
            System.out.println("Hatalı veri girdiniz. Lütfen tekrar deneyin.");
            return;
        }

        // Fiyat/ indirim hesaplamaları
        basePrice = distance * pricePerKm;

        if (passengerAge < 12)
        {
            priceForKids = basePrice + basePrice * 0.5;
            tempPrice = priceForKids; 
        }
        else if (passengerAge > 12 && passengerAge < 24)
        {
            priceForChildren = basePrice + basePrice * 0.1;
            tempPrice = priceForChildren;
        }
        else if (passengerAge > 65)
        {
            priceForElders = basePrice + basePrice * 0.3;
            tempPrice = priceForElders;
        }
        else
        {
            tempPrice = basePrice;
        }

        switch (tripType)
        {
            case 1:
                totalPrice = tempPrice;
                break;
            case 2:
                totalPrice = tempPrice + tempPrice * 0.2;
                break;
        }
        
        System.out.println("Toplam Tutar: " + totalPrice + " TL");
    }
}