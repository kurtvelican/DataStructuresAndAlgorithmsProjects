/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeuygulamalaricalismasi;

/**
 *
 * @author VeliCan KURT
 */
public class dugumler {
    
    public int veri;
    public dugumler sonraki;
    public dugumler onceki;
   
   public dugumler(){
       this.veri=0;
       this.sonraki=null;
       this.onceki=null;
   } 
   
   public dugumler(int deger){
       this.veri=deger;
       this.sonraki=null;
       this.onceki=null;
   }
       
   public void yazdir(){
       
       System.out.println(this.veri);
   }  

}
