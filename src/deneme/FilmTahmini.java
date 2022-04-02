package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmini {

        static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
            System.out.println("0-"+(film.size()-1)+" arasinda bir sayi giriniz");
            int secilenFilmIndex= scan.nextInt();
            filmGetir(film,secilenFilmIndex);

        }

        private static void filmGetir(List<String> film, int index) {
            Scanner scan=new Scanner(System.in);
            System.out.println(film.get(index).replaceAll("\\w","-"));
            System.out.println(film.get(index).length()+"harfli yabanci film tahmin etmek için harf giriniz: ");

            StringBuilder isim = new StringBuilder(film.get(index).replaceAll("\\w", "-"));
            int tahminSayisi=0;
            int dogruTahminSayisi=0;
            char harf=' ';

            do {
                System.out.println("yanlis tahmin sayisi: "+((tahminSayisi)-(dogruTahminSayisi))+"/"+(2*(film.get(index).length())));
                harf=scan.next().toUpperCase().charAt(0);

                for (int i = 0; i < isim.length(); i++) {

                    if (film.get(index).charAt(i)==harf ) {
                        if (!isim.toString().contains(film.get(index).substring(i, i+1))) {
                            dogruTahminSayisi++;
                        }
                        isim.setCharAt(i,harf);
                    }
                }
                System.out.println(isim);
                tahminSayisi+=1;

                if (film.get(index).equalsIgnoreCase(isim.toString())){
                    System.out.println("TEBRİKLEEEERRRR BRAWOOO "+film.get(index)+" filmini "+ tahminSayisi+" tahminde buldunuz. " );
                }
            }while ((tahminSayisi-dogruTahminSayisi)!=2*film.get(index).length());System.out.println("");

            if ((tahminSayisi-dogruTahminSayisi)==2*film.get(index).length()){
                System.out.println("yanlış tahmin sayısı : "+(tahminSayisi-dogruTahminSayisi));
                System.out.println("Game Over.. yine bekleriz.. tahmin edemediğiniz film: "+film.get(index));
            }
        }
    }



