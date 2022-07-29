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
public class Kuyruk_uygulama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        daireselKuyruk k=new daireselKuyruk(5);
       
       
        k.kuyrugaEkle(10);
        k.kuyrugaEkle(20);
        System.out.println("Kuyruktan alınan:"+k.kuyruktanCikar());
        k.kuyrugaEkle(30);
        System.out.println("Kuyruktan alınan:"+k.kuyruktanCikar());
        
        //Javanın kendi kuyruk sınıfı ve kullanımı
     /*   Queue <String> k1=new LinkedList <String>();
        k1.offer("Trabzon");//kuyruğa ekleme 
        k1.offer("İstanbul");
        System.out.println(k1.poll());//kuyruktan çıkarma
        //peek fonskiyonu yığındaki gibi kuyruktada en baştaki
        //elemanı öğrenmeyi sağlar
        //size fonsiyonu kuyruktaki eleman sayısını veriri
        
        
      /*  oncelikKuyrugu k2=new oncelikKuyrugu();
        k2.ekle(10, 2);
        k2.ekle(20, 1);
        k2.ekle(15, 1);
        k2.ekle(30,3);
        k2.ekle(25, 2);
        //sıralama 20 15 10 25 30 olmalı
        //ODev: oncelik kuyruk sınıfı içine listele fonksiyonunu yazıp
        //buradan çağırarark kontrol ediniz */
        
           
    }
    
}
