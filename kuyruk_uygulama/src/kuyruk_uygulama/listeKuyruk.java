/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyruk_uygulama;

/**
 *
 * @author VeliCan KURT
 */
public class listeKuyruk {
    public kuyrukDugum on;
    public kuyrukDugum arka;
    
    public listeKuyruk (){
        this.on=null;
        this.arka=null; 
    }
    
    public boolean bosmu(){
        if(this.on==null)
           return true; 
        else
           return false;
    }
    
    public void ekle(int deger){
        kuyrukDugum yeni=new kuyrukDugum(deger);
        if(this.bosmu()){
            this.on=yeni;
            this.arka=yeni;
        }else{
            this.arka.sonraki=yeni;
            this.arka=yeni;
        }
    }
    
    public int cikart(){
        if(this.bosmu()){
            return -1;
        }
        int veri=this.on.eleman;
        if(this.on.sonraki==null){ //kuyrukta tek değer varsa arka null yapılır
            this.arka=null;
        }
        this.on=this.on.sonraki;//listedeki ilk düğüm silinir, tek düğüm varsa on null olacaktır.
        return veri;
    }
}
