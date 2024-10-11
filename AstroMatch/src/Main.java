import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Merhaba, doğum tarihinizi lütfen ay ve gün olarak giriniz.\n");
        System.out.print("Doğduğunuz ayı giriniz: ");
        int month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        int day = input.nextInt();

        if (month == 1) {
            if (day <= 21) {
                System.out.print("Oğlak burcusunuz.");
            } else if (day >= 22) {
                System.out.print("Kova burcusunuz.");
            }
        } else if (month == 2) {
            if (day <= 19) {
                System.out.print("Kova burcusunuz.");
            } else if (day >= 20) {
                System.out.print("Balık burcusunuz.");
            }
        } else if (month == 3) {
            if (day <= 20) {
                System.out.print("Balık burcusunuz.");
            } else if (day >= 21) {
                System.out.print("Koç burcusunuz.");
            }
        } else if (month == 4) {
            if (day <= 20) {
                System.out.print("Koç burcusunuz.");
            } else if (day >= 21) {
                System.out.print("Boğa burcusunuz.");
            }
        } else if (month == 5) {
            if (day <= 21) {
                System.out.print("Boğa burcusunuz.");
            } else if (day >= 22) {
                System.out.print("İkizler burcusunuz.");
            }
        } else if (month == 6) {
            if (day <= 22) {
                System.out.print("İkizler burcusunuz.");
            } else if (day >= 23) {
                System.out.print("Yengeç burcusunuz.");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.print("Yengeç burcusunuz.");
            } else if (day >= 23) {
                System.out.print("Aslan burcusunuz.");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.print("Aslan burcusunuz.");
            } else if (day >= 23) {
                System.out.print("Başak burcusunuz.");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.print("Başak burcusunuz.");
            } else if (day >= 23) {
                System.out.print("Terazi burcusunuz.");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.print("Terazi burcusunuz.");
            } else if (day >= 23) {
                System.out.print("Akrep burcusunuz.");
            }
        } else if (month == 11) {
            if (day <= 21) {
                System.out.print("Akrep burcusunuz.");
            } else if (day >= 22) {
                System.out.print("Yay burcusunuz.");
            }
        } else if (month == 12) {
            if (day <= 21) {
                System.out.print("Yay burcusunuz.");
            } else if (day >= 22) {
                System.out.print("Oğlak burcusunuz.");
            }
        }

        if (month == 0 || month > 31) {
            System.out.print("Lütfen 1 ile 12 arasında bir değer giriniz!!");
        }
        if (day == 0 || day > 31) {
            System.out.print("Lütfen 1 ile 31 arasında bir değer giriniz!!");
        }
    }
}