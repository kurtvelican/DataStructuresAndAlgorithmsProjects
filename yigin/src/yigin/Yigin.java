/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yigin;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author VeliCan KURT
 */
public class Yigin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   Stack s=new Stack(); 
       String esya;
       Scanner st=new Scanner(System.in);
       System.out.println("Bir eşya giriniz :");
       esya=st.next();
       String str[] = { "Dolap", "Masa",esya,"Sandalye"};
       
       
       for(int i=0; i < str.length; i++)	
            s.push(str[i]);
        while(!s.empty()) 
            System.out.println(s.pop());*/
        
        String kelime="2*(3+i))-(4-5/(2+8))";
       char [] dizi=kelime.toCharArray();
       int sayac=0;
       for(int i=0;i<dizi.length; i++){
           if(dizi[i]=='('){
              sayac++;
           }
           if(dizi[i]==')'){
              sayac--;
           }
           if(sayac<0){
             break;
           }
        }
       if(sayac!=0){
           System.out.println("İfade geçersiz");
       }
       else{
           System.out.println("ifade geçerli");
       }
       
       String ifade="[A+{25*{Y*(B+C-X)-K}}/D*(E+13)+M]";
      // char [] dizi=ifade.toCharArray();
       
       Stack s=new Stack();
       boolean gecerli=true;
       char chOkunan, chCekilen;
       for(int i=0;i<dizi.length;i++){
           chOkunan=dizi[i];
           if((chOkunan=='[') || (chOkunan=='{') || (chOkunan=='(')){
               s.push(chOkunan);
           }
           if((chOkunan==']') || (chOkunan=='}') || (chOkunan==')')){
               if(s.empty()){
                    gecerli=false;break;
               }
               chCekilen=(char)s.pop();
               if((chCekilen=='[')&&(chOkunan!=']')){
                    gecerli=false;break;
               }
               else if((chCekilen=='{')&&(chOkunan!='}')){
                    gecerli=false;break;
               }
               else if((chCekilen=='(')&&(chOkunan!=')')){
                    gecerli=false;break;
               }
               
               
           }
               
           }
       
           if(!s.empty()){
              gecerli=false;
           }
           System.out.println("İfade Geçerli:"+gecerli);
       
    }
    
    
}
