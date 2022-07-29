public class kuyrukDugum {
    public int eleman;
    public kuyrukDugum sonraki;

    public kuyrukDugum(int e){ 
    this.eleman = e; 
    this.sonraki = null;
    }

    public void yazdir(){
        System.out.println("Eleman değeri : " + this.eleman);
    }
    
}
