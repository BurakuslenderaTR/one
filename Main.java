import java.util.Scanner;
    class Program {
        public static void main(String args[]) {
            Scanner a =new Scanner(System.in);
            int ilk , iki , sonuc = 0;
            System.out.println("İlk sayıyı giriniz.");
            ilk = a.nextInt();
            System.out.println("İkinci sayıyı giriniz.");
            iki = a.nextInt();
            if(ilk > iki) {sonuc = ilk % iki;
            }else if (iki < ilk)
            {sonuc = iki % ilk; }else sonuc = 0;{}
            if (sonuc == 0) { System.out.println("Birbirine kalansız ve tam bölünür."); }
            else if (sonuc==0);
            System.out.println("Birbirine tam bölünemez ve kalan sonuç = "+sonuc+"  olur.");} }
