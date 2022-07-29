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
public class listeler {
    
    public dugumler head;
    
    public listeler(){
        this.head=null;
    }
    
    public void TBbasaEkleme(int deger){
        
        dugumler yeni= new dugumler(deger);
        
        if(this.head==null){   
            head=yeni; 
        }
        else{
            yeni.sonraki=this.head;
            head=yeni;
        } 
    }
    
    public void TBsonaEkleme(int deger){
       
        dugumler yeni=new dugumler(deger);
        if(this.head==null){
            this.head=yeni;
        }
        else{
            dugumler temp= this.head;
            
            while(temp.sonraki != null){
                temp=temp.sonraki;
            }
            temp.sonraki=yeni;    
        }
            
    }
    
    public void TBarayaEkleme(int deger,int indis){
        
        if((this.head==null)|| (indis==1)){
             this.TBbasaEkleme(deger);
             return;
         }
        dugumler yeni=new dugumler(deger);
        
        dugumler temp=this.head;
        int sayac=1;
        
        while(temp.sonraki!=null){
             if(sayac+1==indis){
                 break;
             }
             sayac++;
             temp=temp.sonraki;
         }
         yeni.sonraki=temp.sonraki;
         temp.sonraki=yeni;
        
    }
    
    public void CBbasaEkleme(int deger){
        
        dugumler yeni= new dugumler(deger);
        
        if(this.head==null){   
            head=yeni; 
        }
        else{
            this.head.onceki=yeni;
            yeni.sonraki=this.head;
            this.head=yeni;
        } 
    }
    
    public void CBsonaEkleme(int deger){
       
        dugumler yeni=new dugumler(deger);
        if(this.head==null){
            this.head=yeni;
        }
        else{
            dugumler temp= this.head;
            
            while(temp.sonraki != null){
                temp=temp.sonraki;
            }
            temp.sonraki=yeni;  
            yeni.onceki=temp;
        }
            
    }
    
    public void listele(){
        
        dugumler temp=this.head;
        if(temp==null){
            System.out.println("Liste boş");
            return;
        }
        System.out.println("Liste elemanları :");
        while(temp!=null){
            temp.yazdir();
            temp=temp.sonraki;
        }
    
    
    }
    
    
}
