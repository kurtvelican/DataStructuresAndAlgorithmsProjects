import java.util.Stack;

public class App {
    //infix bir ifadenin postfixe dönüştürülmesi ve postfix bir ifadenin sonucunun hesaplanması

    public static int oncelik(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;    
        }
        return -1;
    }

    public static String infix2postfix(String infixIfade){
        
        Stack <Character> s = new Stack <>();
        String postfixIfade = "";

        for(int i = 0;i < infixIfade.length();i++){
            char c = infixIfade.charAt(i);
            if(oncelik(c) > 0){
                while( !s.isEmpty() && (oncelik(s.peek()) >= oncelik(c)) ){
                    postfixIfade = postfixIfade + s.pop();
                }
                s.push(c);
            }
            else{
                postfixIfade = postfixIfade + c;
            }
        }
        int yiginBoyut = s.size();
        for(int i = 0; i < yiginBoyut;i++){
            postfixIfade = postfixIfade + s.pop();
        }
        return postfixIfade;
    }

    public static int postfixHesapla(String postIfade){
        String [] postfixDizi = postIfade.split(" ");

        Stack <String> y = new Stack <>();
        String parca; 
        int s1=0,s2=0,s3=0;

        for(int i=0;i < postfixDizi.length;i++){
            //System.out.println(postfixDizi[i]);
            parca = postfixDizi[i];
            parca.trim();   //boşlukların temizlenmesini sağlar

            if(parca.equals("")) continue;  //parça boş işe bir sonraki dizi elemanına geç

            if(parca.equals("+")){  //stringler için eşitlik kontrolü
                s2 = Integer.parseInt(y.pop()); //yığından çekilen string ifade int'e dönüştürülür
                s1 = Integer.parseInt(y.pop());
                s3 = s1+s2;
                y.push(String.valueOf(s3)); // String.valueOf herhangi tipteki veriyi stringe dönüştürür
            }
            else if(parca.equals("-")){  
                s2 = Integer.parseInt(y.pop()); 
                s1 = Integer.parseInt(y.pop());
                s3 = s1-s2;
                y.push(String.valueOf(s3)); 
            }
            else if(parca.equals("*")){ 
                s2 = Integer.parseInt(y.pop()); 
                s1 = Integer.parseInt(y.pop());
                s3 = s1*s2;
                y.push(String.valueOf(s3)); 
            }
            else if(parca.equals("/")){  
                s2 = Integer.parseInt(y.pop()); 
                s1 = Integer.parseInt(y.pop());
                s3 = s1/s2;
                y.push(String.valueOf(s3)); 
            }
            else{
                y.push(parca);
            }
        }

        int sonuc = Integer.parseInt(y.pop());
        if(!y.isEmpty()){
            System.out.println("Postfix ifada hatalı");
            return 0;
        }

        return sonuc;
    }


    public static void main(String[] args) throws Exception {

       /* String ifade = "a+b*c-d";
        System.out.println(infix2postfix(ifade));*/

        String postfixIfade = "6  6    85 * +   10 -";
        System.out.println(postfixHesapla(postfixIfade));

    }
}
