/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciftBagliListe;

/**
 *
 * @author VeliCan KURT
 */
public class cbliste {
    public Dugum ilk;
    
    public cbliste(){
       this.ilk=null;
    }
    
    public void basaEkle(int deger){
         Dugum yeni=new Dugum(deger);
         this.ilk.onceki=yeni;
         yeni.sonraki=this.ilk;
         this.ilk=yeni;
    }
    
     public void sonaEkle(int deger){
        
        Dugum yeni=new Dugum(deger);
        if(this.ilk==null){
           this.ilk=yeni;
        }
        else{
            Dugum temp=this.ilk;
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
         Dugum yeni=new Dugum(deger);
         
         Dugum temp=this.ilk;
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
    
     public void listele(){
        
        Dugum temp=this.ilk;
        if(temp==null){
            System.out.println("Liste boþ");
            return;
        }
        System.out.println("Liste elemanlarý");
        while(temp!=null){
            temp.yazdir();
            temp=temp.sonraki;
        }
        
        
    }
}
