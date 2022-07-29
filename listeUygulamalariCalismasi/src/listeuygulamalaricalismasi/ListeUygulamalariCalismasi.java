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
public class ListeUygulamalariCalismasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       listeler tbliste=new listeler();
        tbliste.TBbasaEkleme(10);
        tbliste.TBsonaEkleme(20);
        tbliste.TBbasaEkleme(15);
        
        tbliste.CBbasaEkleme(22);
        tbliste.CBsonaEkleme(6);
        tbliste.CBbasaEkleme(18);
        
        tbliste.listele();
        
    }
    
    
    
    
   
    
    
}
