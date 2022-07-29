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
public class Dugum {
    
    public int veri;
    public Dugum onceki;
    public Dugum sonraki;
    
    public Dugum(){
        this.veri=0;
        this.onceki=null;
        this.sonraki=null;
    }
    
    public Dugum(int deger){
        this.veri=deger;
        this.onceki=null;
        this.sonraki=null;
    }
    
    public void yazdir(){
        System.out.println(this.veri);
    }
}
