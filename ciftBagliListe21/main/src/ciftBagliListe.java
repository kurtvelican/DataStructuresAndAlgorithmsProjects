public class ciftBagliListe {
    
    public dugum ilk; //listenin başını tutan değişken

    public ciftBagliListe(){
        this.ilk = null;  //liste boş olarak yaratılır
    }

    public void basaEkle(int deger){
        dugum yeni = new dugum(deger);

        if(this.ilk == null){
            this.ilk = yeni;
            return;
        }

        this.ilk.onceki = yeni;   //listenin başındakinden önceki eleman yeni olur
        yeni.sonraki = this.ilk;
        this.ilk = yeni;
    }

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
        yeni.onceki = temp;
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
        temp.sonraki.onceki = yeni; 
        yeni.sonraki = temp.sonraki; 
        temp.sonraki = yeni;
        yeni.onceki = temp;
    }

    public int listeElemanSayisi(){
        int sayac = 0;
        dugum temp = this.ilk;

        while(temp != null){
            sayac++;
            temp = temp.sonraki;
        }
        return sayac;
    }

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

        //temp.sonraki.sonraki = temp.sonraki.onceki;
        temp.sonraki = temp.sonraki.sonraki;
        

        return 0;
    }


    
    public void listele(){
        dugum temp = this.ilk;

        if(temp != null){
            System.out.println("Liste Elemanları");
            while(temp != null){
                temp.yazdir();
                temp = temp.sonraki;
            }
        }
        else{
            System.out.println("Liste Boştur");
        }
    }

}
