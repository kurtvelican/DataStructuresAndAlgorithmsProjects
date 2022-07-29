public class App {
    public static void main(String[] args) throws Exception {
     
        oncelikKuyrugu k = new oncelikKuyrugu();

        k.ekle(10, 2);
        k.ekle(20, 3);
        k.ekle(30, 1);
        k.ekle(40, 3);
        k.ekle(50, 4);

        k.listele();
    }
}
