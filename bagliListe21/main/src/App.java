public class App {
    public static void main(String[] args) throws Exception {
       
      /*  dugum yeni = new dugum(5);
        yeni.yazdir();*/

        tekBagliListe listem = new tekBagliListe();
        
        listem.basaEkle(6);
        listem.basaEkle(10);
        listem.basaEkle(24);
        listem.sonaEkle(25);
        listem.sonaEkle(32);
        listem.sonaEkle(2);
        listem.basaEkle(4);
        listem.arayaEkle(20, 3);

      /* dugum d = new dugum(40);
         listem.basaEkle();
      */

        listem.listele();
        System.out.println("Listenin Eleman Sayısı : " + listem.listeElemanSayisi());
        
        dugum sonuc = listem.elemanBul(20);
        
        if(sonuc == null){
          System.out.println("Aranan değer bulunamadı");
        }
        else{
          System.out.println("Aranan değer bulundu");
        }


        System.out.println( listem.elemanSil(24));

    }
}
