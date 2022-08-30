public class miniproje15 {
    public static boolean asalMi(int sayi){  //boolean ile asal mı değil mi , true mu false mu karşılaştırmasını yapıyoruz.
        for (int i =2; i<sayi; i++){
            if (sayi % i == 0){   //sayi tam bölünüyorsa asal değil demektir, o sebeple return false deriz.
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        //Asal sayı bulma programı,  1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayılara, asal sayılar denir.

        for (int i=2; i<1000; i++){
            if (asalMi(i)){
                System.out.println(i);
            }
        }


    }
}
