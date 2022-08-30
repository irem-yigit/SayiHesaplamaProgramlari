import java.util.Scanner;

public class miniproje16 {
    public static int ebobBulma(int sayi1, int sayi2){

        int ebob=1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++){
            if (sayi1 % i == 0 && sayi2 % i == 0){
                ebob=i;

            }
        }
        return ebob;

    }
    public static void main(String[] args){
        //Kullanıcıdan alınan 2 sayının EBOB unu bulma programı
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int birinci_sayi= scan.nextInt();

        System.out.print("İkinci sayı: ");
        int ikinci_sayi=scan.nextInt();

        System.out.println("iki sayının EBOB'u : " + ebobBulma(birinci_sayi,ikinci_sayi));

    }

}
