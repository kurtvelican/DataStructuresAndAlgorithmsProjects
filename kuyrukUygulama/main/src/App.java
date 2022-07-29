public class App {
    public static void main(String[] args) throws Exception {
        
      /*  daireselKuyruk dk = new daireselKuyruk(5);
        dk.kuyrugaEkle(10);
        dk.kuyrugaEkle(20);
        
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());

        dk.kuyrugaEkle(30);
        dk.kuyrugaEkle(40);
        dk.kuyrugaEkle(50);
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        dk.kuyrugaEkle(60);
        dk.kuyrugaEkle(70);

        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());
        System.out.println("Kuyruktan çekilen : " + dk.kuyruktanCikar());*/


        listeKuyruk lk = new listeKuyruk();
        lk.ekle(10);
        lk.ekle(20);
        System.out.println(lk.cikart());
        System.out.println(lk.cikart());
        System.out.println(lk.cikart());
    }
}
