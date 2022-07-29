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
public class daireselKuyruk {
    
    public int bas;
    public int son;
    public int eSay;
    public int boyut;
    public int [] kuyruk;
    
    //yapılandırıcı fonksiyon
    //kBoyut oluşturulmak istenen kuyruğun boyutu
    //kullanıcı tarafından girilir
    
    public daireselKuyruk(int kBoyut){
        
        this.bas=0;
        this.son=-1;
        this.eSay=0;
        this.kuyruk=new int [this.boyut];

    }
    
    public boolean dolumu(){
        if(this.eSay==this.boyut)
            return true;
        else
            return false;
    }
    public boolean bosmu(){
        if(this.eSay==0)
            return true;
        else
            return false;
    }
    
    public void kuyrugaEkle(int deger){
        if(!this.dolumu()){
            this.son++;
            this.eSay++;
            if(this.son==this.boyut){
                this.son=0;
            }
            this.kuyruk[this.son]=deger;
        }
    }
    
    public int kuyruktanCikar(){
        int veri=0;
        if(!this.bosmu()){
            veri=this.kuyruk[this.bas];
            this.bas++;
            this.eSay--;
            if(this.bas==this.boyut){
                this.bas=0;
            }
        }
        return veri;
    }
    
    
}
