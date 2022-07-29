import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
        
        //yığın ile parantez probleminin çözümü
        //ilk çözüm

       /* String ifade = "(2*(3+i)-(4-5/(2+8))";

        Stack s = new Stack();

        char [] ifade_dizi = ifade.toCharArray();

        boolean gecerli = true;
        char k1,k2;

        for(int i = 0;i< ifade_dizi.length;i++){
            k1=ifade_dizi[i];
            if(k1 =='('){
                s.push(k1);
            }
            if(k1 ==')'){
                if(s.isEmpty()){
                    gecerli = false;
                    break;
                }
                k2=(char) s.pop();
                if((k2 == ')') && (k1 !=')')){
                    gecerli = false;
                    break;
                }

            }


        }

        if(!s.isEmpty()){
            gecerli = false;
        }

        System.out.println("İfade geçerli : " + gecerli);
        */

        //ikinci çözüm

        String ifade_1 = "[A+{25*{Y*(B+C+X)-K}}/D*(E+13)+M]";

        char [] ifade_dizi_1 = ifade_1.toCharArray();

        Stack s1 = new Stack();

        boolean gecerli_1 = true;

        char chOkunan , chCekilen;

        for(int i=0;i< ifade_dizi_1.length;i++){
            chOkunan = ifade_dizi_1[i];

            if( (chOkunan == '[') || (chOkunan == '{') || (chOkunan == '(') ){
                s1.push(chOkunan);
            }
            if( (chOkunan == ']') || (chOkunan == '}') || (chOkunan == ')') ){
                if(s1.isEmpty()){
                    gecerli_1 = false;
                    break;
                }
                chCekilen =(char) s1.pop();

                if((chCekilen == '[') && (chOkunan!=']')){
                    gecerli_1 = false;
                    break;
                }
                else if((chCekilen == '{') && (chOkunan!='}')){
                    gecerli_1 = false;
                    break;
                }
                else if((chCekilen == '(') && (chOkunan!=')')){
                    gecerli_1 = false;
                    break;
                }
                
            }


        }

        if(!s1.isEmpty()){
            gecerli_1 = false;
        }

        System.out.println("İfade geçerli : " + gecerli_1);


    }
}
