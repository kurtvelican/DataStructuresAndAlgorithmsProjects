public class siraliTekBagliListe {

        public int mutlakMin;
        public int swap;
        public siraliTekBagliListe ilk;
        public int veri;
        public siraliTekBagliListe sonraki;
        public int sayac = 0;
    
        public siraliTekBagliListe(){
            this.ilk = null;
            this.veri = 0;
            this.sonraki = null;
        }
    
        public siraliTekBagliListe(int deger){
            this.veri = deger;
            this.sonraki = null;
        }
    
        public void yazdir(){
            System.out.println(this.veri);
        }   



    public void elemanEkle(int deger){
        siraliTekBagliListe yeni = new siraliTekBagliListe(deger);
        siraliTekBagliListe temp = this.ilk;

        if(this.ilk == null){
            this.ilk = yeni;
            return;
        }

        while(temp.sonraki != null){
            temp = temp.sonraki;
        } 

        temp.sonraki = yeni;
        
    }
  
    

    public void listele(){

        siraliTekBagliListe temp = this.ilk; //temp değişkeni liste başına konumlandırılır
        
        

        if(temp == null){
            System.out.println("Liste boştur");
            return;
        }

    /*   if(ilk.veri < ilk.sonraki.veri){

            mutlakMin = ilk.veri;
        }
        else if(ilk.veri > ilk.sonraki.veri){

            mutlakMin = ilk.sonraki.veri;
        }*/

        while(temp != null){
            sayac++;
            temp = temp.sonraki;
        }


        for(int i = 0; i < sayac ;i++){
            temp = this.ilk;
        while(temp != null){
      
            
            if(temp.sonraki == null){
                temp.yazdir();
                break;
            }

            if(temp.veri > temp.sonraki.veri){
                swap = temp.veri;
                temp.veri = temp.sonraki.veri;
                temp.sonraki.veri = swap;
            }
            temp.yazdir();
            temp = temp.sonraki;
        }
        System.out.println("----------------");
            
      }  
            
    }
}
