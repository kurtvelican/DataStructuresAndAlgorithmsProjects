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
public class dugum {
    public int veri;
    public dugum sonraki;
    public dugum onceki;
    //her sınıf içerisinde yazılmasada default olarak aşağıdaki gibi
    //parametre almayan bir yapılandırıcı metod vardır
    //siz yazmasanızda derleyici bunu ekler
    
    public dugum(){
        this.veri=0;
        this.sonraki=null;
       this.onceki=null;
    }
    
    public dugum(int deger){
        this.veri=deger;
        this.sonraki=null;
        this.onceki=null;
    }
  
    public void yazdir(){
        System.out.println(this.veri);
    }
}
