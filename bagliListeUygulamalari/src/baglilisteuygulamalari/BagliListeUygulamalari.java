/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baglilisteuygulamalari;
import java.util.Scanner;
/**
 *
 * @author VeliCan KURT
 */
public class BagliListeUygulamalari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    /*  
        Dugum yeni=new Dugum();//Dugum sınıfından yeni adlı bir nesne türetildi
        yeni.veri=5;
        //yeni.sonraki=null;
        yeni.yazdir();
        
        Dugum baska=new Dugum();
        baska.veri=10;
        //baska.sonraki=null;
        baska.yazdir();
        
        
        Dugum yeni1=new Dugum(15);
        yeni1.yazdir();
        
      */
        
     int sayi;
     Scanner reader = new Scanner(System.in);
     System.out.println("Bir sayi giriniz :");  
     sayi=reader.nextInt();
      
      liste benimListem=new liste();
      benimListem.basaEkle(10);
      benimListem.basaEkle(20);
      benimListem.sonaEkle(5);
      benimListem.veriAlma(sayi);
      benimListem.arayaEkle(25,4);
      benimListem.listele();
      
    }
}
