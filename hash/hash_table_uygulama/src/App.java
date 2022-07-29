import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        100 tane anahtar değeri (5 basamaklı) (veri) rastgele üretip bu değerleri boyutu 100
        olan hash tablosuna yerleştiren uygulama

        Çakışmaların çözümlenmesinde linear probing ve quadratic probing kullanılmaktadır

        Anahtar değerleri pozitif tamsayıdır

        Hash tablosu dizi olarak oluşturulmuştur

        Hash fonksiyonu division (mod alma) olarak kullanılmaktadır
        */

        int key,index;
        int dizi_boyut = 100;
        int [] hash_table_l = new int [dizi_boyut];
        int [] hash_table_q = new int [dizi_boyut];
    
        for(int i=0;i < dizi_boyut;i++){
            hash_table_l[i] = -1; //-1 değeri olanlar boş demektir
            hash_table_q[i] = -1;
        }

        int sayac=0;  //100 rastgele anahtar üretimiyle ilgili sayaç

        int sayac1_l = 0;   //direkt tabloya yerleşenlerin sayısı
        int sayac2_l = 0;   //çakışmaların sayısı
        int sayac3_l = 0;   //çakışmalarda yapılan arama sayısı

        int sayac1_q = 0;   //direkt tabloya yerleşenlerin sayısı
        int sayac2_q = 0;   //çakışmaların sayısı
        int sayac3_q = 0;   //çakışmalarda yapılan arama sayısı

        while(sayac < dizi_boyut){
            Random r = new Random();
            key = 10000 + r.nextInt(90000);  //5 basamaklı sayı üretimi 10000-99999 aralığında üretim demektir - bu tabloya eklenecek değer
            index = key % dizi_boyut;   //hash fonk uygulanır ve üretilen değerin hash tablosundaki pozisyon bilgisi elde edilir

            //linear probing ile çakışma çözümleme
            if(hash_table_l[index] < 0){  //tabloda ilgili alan boş ise key o alana yazılır,çakışma yok
                hash_table_l[index] = key;
                sayac1_l++;
            }
            else{ //çakışma var
                sayac2_l++;
                int k = 1;
                while(hash_table_l[(index + k)% dizi_boyut] >= 0){
                    k++;
                    sayac3_l++;
                }
                int yeniIndex =(index + k)% dizi_boyut;
                hash_table_l[yeniIndex] = key;
            }

            //quadratic probing ile çakışma çözümleme
            if(hash_table_q[index] < 0){  //tabloda ilgili alan boş ise key o alana yazılır,çakışma yok
                hash_table_q[index] = key;
                sayac1_q++;
            }
            else{ //çakışma var
                sayac2_q++;
                int k = 1;
                
                System.out.println(index);
                while(hash_table_q[((index) + (k^2)) % dizi_boyut] >= 0){
                    k++;
                    sayac3_q++;
                }
                int yeniIndex =((index) + (k^2)) % dizi_boyut;
                hash_table_q[yeniIndex] = key;
            }

            sayac++;
        }


        System.out.println("---Linear Probing---");
        System.out.println("Direkt yerleşen : "+ sayac1_l);
        System.out.println("Çakışan : "+ sayac2_l);
        System.out.println("Çakışma sonrası yapılan arama : "+sayac3_l);

        System.out.println("---Quadratic Probing---");
        System.out.println("Direkt yerleşen : "+ sayac1_q);
        System.out.println("Çakışan : "+ sayac2_q);
        System.out.println("Çakışma sonrası yapılan arama : "+sayac3_q);
    }
}
