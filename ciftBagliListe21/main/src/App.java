public class App {
    public static void main(String[] args) throws Exception {
        
        ciftBagliListe CBlistem = new ciftBagliListe();
        CBlistem.basaEkle(12);
        CBlistem.basaEkle(15);
        CBlistem.sonaEkle(30);
        CBlistem.arayaEkle(25, 2);
        CBlistem.sonaEkle(22);
        CBlistem.basaEkle(18);
        CBlistem.elemanSil(25);
        CBlistem.listele();

    }
}
