import java.util.Scanner;

public class miniproje10 {
    public static void main(String[] args){
        /*Girilen bir sayının Armstrong sayısı olup olmadığını bulma programı
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olabilmesi için şu şartı sağlaması gerekmektedir;
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4, basamak sayısıdır) --> sayı 4 basamaklıysa her bir basamağın 4 üssü (^4) alınır.
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3, basamak sayısıdır)  --> sayının 3 ile üssünü alıp, toplarsak sonuç 371 olur.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi=scan.nextInt();
        System.out.print("Basamak sayısı giriniz: ");
        int basamak_sayisi= scan.nextInt();

        int gecici_sayi=sayi;
        int toplam=0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            System.out.println("Basamak degeri: " + basamak_degeri);
            gecici_sayi /=10;
            System.out.println("gecici sayi: " + gecici_sayi);

            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            System.out.println("toplam: " + toplam);

        }while (gecici_sayi > 0);
        if (sayi== toplam){
            System.out.println("Bu sayı bir Armstrong sayısıdır...");
        }
        else
            System.out.println("Bu sayı bir Armstrong sayısı değildir...");



    }
}
