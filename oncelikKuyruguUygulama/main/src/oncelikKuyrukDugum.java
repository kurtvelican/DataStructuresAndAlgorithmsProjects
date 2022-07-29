public class oncelikKuyrukDugum {
    
    public int veri;
    public int oncelik;
    public oncelikKuyrukDugum sonraki;

    public oncelikKuyrukDugum(int v,int o){
        this.veri = v;
        this.oncelik = o;
        this.sonraki = null;
    }

    public void yazdir(){
        System.out.println("Öncelik : " + this.oncelik +"   Veri : " + this.veri);
    }
}
