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
public class kuyrukDugum {
    public int eleman;
    public kuyrukDugum sonraki;
    
  public kuyrukDugum(int e){
        this.eleman=e;
        this.sonraki=null;
    }
    
    public void yazdir(){
        System.out.println("Eleman degeri:"+this.eleman);
    }
    
}
