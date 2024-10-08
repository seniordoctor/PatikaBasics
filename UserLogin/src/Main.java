import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcı giriş sayfası

        // Kullanıcı adı ve şifre alınır
        String kullaniciAdi = "admin";
        String sifre = "12345";
        Boolean providedAccess = false;

        Scanner input = new Scanner(System.in);
        // Kullanıcı adı ve şifre kullanıcıdan istenir
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdiGiris = input.nextLine();

        System.out.print("Şifre: ");
        String sifreGiris = input.nextLine();

        // Kullanıcı adı ve şifre kontrol edilir
        if (kullaniciAdi.equals(kullaniciAdiGiris) && sifre.equals(sifreGiris)) {
            System.out.println("Giriş Başarılı");
            providedAccess = true;
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }

        // Şifre sıfırlama
        if (!providedAccess) {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String sifreSifirla = input.nextLine();

            if (sifreSifirla.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();
                if (sifre.equals(yeniSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen farklı bir şifre giriniz.");
                } else {
                    sifre = yeniSifre;
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}