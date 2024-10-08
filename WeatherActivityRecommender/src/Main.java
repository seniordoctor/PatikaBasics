import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */
        System.out.print("Merhaba, canın sıkıldığı tabi ki bana geldin ve etkinliklerin kralını önereceğim sana! \n");

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int heat = input.nextInt();

        if (heat < 5)
            System.out.println("Kayak yapabilirsiniz.");
        else if (heat >= 5 && heat <= 15)
            System.out.println("Sinema etkinliğini öneririm.");
        else if (heat > 15 && heat <= 25)
            System.out.println("Piknik yapabilirsiniz.");
        else
            System.out.println("Yüzme yapabilirsiniz.");
    }
}