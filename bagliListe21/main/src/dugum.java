public class dugum {
    
    public int veri;
    public dugum sonraki;

    public dugum(){
        this.veri = 0;
        this.sonraki = null;
    }

    public dugum(int deger){
        this.veri = deger;
        this.sonraki = null;
    }

    public void yazdir(){
        System.out.println(this.veri);
    }

}
