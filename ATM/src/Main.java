import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ATM Project with Switch-Case

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            String verificationResult = verified(userName, password);
            if (verificationResult.equals("verified")) {
                System.out.println("Giriş başarılı!");

                System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış");
                System.out.print("lütfen yapmak istediğiniz işlemi seçiniz: ");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz tutar: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Yeni bakiyeniz: " + balance);
                        break;

                    case 2:
                        System.out.print("Çekmek istediğiniz tutar: ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiyeniz yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                        }
                        break;

                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;

                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        break;

                    default:
                        System.out.println("Geçersiz işlem.");
                        break;
                }
            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı! Tekrar deneyiniz.");
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur. Lütfen bankanızla iletişime geçiniz.");
            }
        }
    }


    private static String verified(String userName, String password) {
        if ("recep".equals(userName) && "123".equals(password)) {
            return "verified";
        } else {
            return "unverified";
        }
    }
}