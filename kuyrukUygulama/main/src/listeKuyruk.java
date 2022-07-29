public class listeKuyruk {
    
    
    private kuyrukDugum on; // Kuyruğun önü
    private kuyrukDugum arka;// Kuyruğun arkası
    public listeKuyruk(){
        this.on = this.arka = null;
    }
    public boolean bosmu(){
        if(this.on==null) return true;
        else return false;
    }
         

    public void ekle(int eleman) {
        kuyrukDugum yeni=new kuyrukDugum(eleman);
        if(this.bosmu()){
            this.on=yeni;
            this.arka = yeni;
        }
        else{
            this.arka.sonraki=yeni;
            this.arka=yeni;
        }
    } 

    public int cikart() { 
        if(this.bosmu()){
            return -1;
        }
        int veri=this.on.eleman;
        if(this.on.sonraki==null){  //kuyrukta tek değer varsa arka null yapılır
            this.arka=null;
        }
        this.on=this.on.sonraki;    //listedeki ilk düğüm silinir,tek düğüm varsa on null olacaktır
        return veri;
    }
}
