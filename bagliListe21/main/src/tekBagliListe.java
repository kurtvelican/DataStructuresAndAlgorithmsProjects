public class tekBagliListe {

    public dugum ilk; //listenin başını tutan değişken

    public tekBagliListe(){
        this.ilk = null;  //liste boş olarak yaratılır
    }

    public void basaEkle(int deger){
        dugum yeni = new dugum(deger);
        yeni.sonraki = ilk;
        this.ilk = yeni;
    }

    /*public void basaEkle(dugum yeni){
        yeni.sonraki = ilk;
        this.ilk = yeni;
    }*/

    public void sonaEkle(int deger){
        dugum yeni = new dugum(deger);
        dugum temp = this.ilk;

        if(this.ilk == null){
            this.basaEkle(deger);   // this.ilk = yeni;
            return;
        }

        while(temp.sonraki != null){
            temp = temp.sonraki;
        } 

        temp.sonraki = yeni;
    }

    public void arayaEkle(int deger , int indeks){
        
        if( (this.ilk == null) || (indeks == 1) ){
            this.basaEkle(deger);
            return;
        }

        dugum yeni = new dugum(deger);
        dugum temp = this.ilk;
        int sayac = 1;

        while(temp.sonraki != null){

            if(sayac + 1 == indeks){
                break;
            }
            sayac++;
            temp=temp.sonraki;
        }
        yeni.sonraki = temp.sonraki; //yeşil bağlantı
        temp.sonraki = yeni;         //mavi bağlantı
    }


    //listenin eleman sayısını geri döndüren fonksiyon
    public int listeElemanSayisi(){
        int sayac = 0;
        dugum temp = this.ilk;

        while(temp != null){
            sayac++;
            temp = temp.sonraki;
        }
        return sayac;
    }


    //listede değeri arar bulursa o düğümü döndürür
    public dugum elemanBul(int deger){
        dugum temp = this.ilk;
        dugum bulunan = null;

        while(temp != null){

            if(temp.veri != deger){
                temp = temp.sonraki;                
            }
            else{
                bulunan = temp;
                break;
            }
        }
        return bulunan;
    }


    //istenen değeri listeden silen fonksiyon
    //boş listeden eleman silinmeye çalışılırsa fonksiyon -1 değer döndürür
    //eleman başarılı bir şekilde silinirse 0 değerini döndürür
    //silinmeye çalışılan eleman listede yoksa -2 döndürür
    public int elemanSil(int deger){

        if(this.ilk == null){ //liste boştur
            return -1;
        }

        if(this.ilk.veri == deger)  //ilk eleman silinecekse , liste başlangıcı değiştirilmeli(sonraki düğüm liste başı olarak ayarlanmalı)
        {
            this.ilk = this.ilk.sonraki;
            return 0;
        }

        dugum temp = this.ilk;

        while(temp.sonraki.veri != deger){
            
            if(temp.sonraki.sonraki == null){ //liste sonuna gelinmişse eleman yoktur , -2 döner
                return -2;
            }
            temp = temp.sonraki;
        }

        temp.sonraki = temp.sonraki.sonraki;
        return 0;
    }




    //listedeki elemanları baştan sona yazan fonksiyon
    public void listele(){

        dugum temp = this.ilk; //temp değişkeni liste başına konumlandırılır

        if(temp == null){
            System.out.println("Liste boştur");
            return;
        }

        while(temp != null){
            temp.yazdir();
            temp = temp.sonraki;
        }
    }
}
