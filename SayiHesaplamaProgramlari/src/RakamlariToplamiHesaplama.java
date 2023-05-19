import java.util.Scanner;

public class RakamlariToplamiHesaplama {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi= scan.nextInt();

        int toplam=0;

        do {
            toplam += sayi % 10;

            sayi/=10;
            //System.out.println("Sayi: " + sayi);

        }while (sayi>0);
        System.out.println("Rakamların toplamı: " + toplam);

    }
}
