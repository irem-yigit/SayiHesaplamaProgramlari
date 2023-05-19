import java.util.Scanner;

public class TekCiftSayiHesaplama {
    public static void main(String[] args){
        //Girilen sayının tek veya çift olup olmadığını bulma programı

        /*Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0){
            System.out.println("Sayı çifttir...");
        }
        else {
            System.out.println("Sayı tektir...");
        }*/
        int i=1;

        while (i<10){
            if (i%2==0){
                String yazdir = "çift";
                System.out.println(yazdir);
            }
            i++;

        }
    }
}
