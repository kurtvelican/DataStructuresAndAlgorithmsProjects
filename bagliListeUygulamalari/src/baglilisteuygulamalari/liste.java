/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baglilisteuygulamalari;

/**
 *
 * @author VeliCan KURT
 */
public class liste {
    public dugum ilk; //liste başını tutan değişken
    
    public liste(){
        this.ilk=null; //liste boş olarak yaratılır
    }
    
    public void basaEkle(int deger){
        //Dugum yeni=new Dugum();
        //yeni.veri=deger;
       dugum yeni=new dugum(deger);
      
       if(this.ilk==null){
           ilk=yeni;
       }
       else{
           this.ilk.onceki=yeni;
           yeni.sonraki=this.ilk;
           this.ilk=yeni;
       }
    }
    
    public void sonaEkle(int deger){
        if(this.ilk==null){ //liste boş
            this.basaEkle(deger);
            return;
        }
       
        dugum yeni=new dugum(deger);
        if(this.ilk==null){
           this.ilk=yeni;
        }
        else{
            dugum temp=this.ilk;
            while(temp.sonraki!=null){
                temp=temp.sonraki;
            }
            temp.sonraki=yeni;
            yeni.onceki=temp;
        
        }  
    }
    
    public void arayaEkle(int deger,int indis){
         if((this.ilk==null)|| (indis==1)){
             this.basaEkle(deger);
             return;
         }
         dugum yeni=new dugum(deger);
        
         dugum temp=this.ilk;
         int sayac=1;
         while(temp.sonraki!=null){
             if(sayac+1==indis){
                 break;
             }
             sayac++;
             temp=temp.sonraki;
         }
         yeni.sonraki=temp.sonraki;
         temp.sonraki.onceki=yeni;
         temp.sonraki=yeni;
         yeni.onceki=temp;
          
    }
    
    public  void veriAlma(int sayi){
   
      dugum yeni=new dugum(sayi);
      yeni.sonraki=this.ilk;
      ilk=yeni;
    }
    
    //listedeki tüm elemanları ekrana yazdırır
    public void listele(){
        
        dugum temp=this.ilk;
        if(temp==null){
            System.out.println("Liste boş");
            return;
        }
        System.out.println("Liste elemanları :");
        while(temp!=null){
            temp.yazdir();
            temp=temp.sonraki;
        }
    }
}