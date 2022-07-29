public class daireselKuyruk {
    public int bas , son;
    public int [] kuyruk;
    public int boyut;   //kuyruğun boyutu
    public int eSay;    //kuyruktaki eleman sayısı

    public daireselKuyruk(int kBoyut){
        this.bas=0;
        this.son=-1;
        this.eSay=0;
        this.boyut = kBoyut;
        this.kuyruk = new int [this.boyut];
    }

    public boolean dolumu(){
        if(this.eSay == this.boyut) {
            return true;
        }
        return false;
    }

    public boolean bosmu(){
        if(this.eSay == 0) {
            return true;
        }
        return false;
    }

    public void kuyrugaEkle(int deger){
        if(!this.dolumu()){
            this.son++;
            if(this.son == this.boyut){
                this.son = 0;
            }
            this.kuyruk[this.son] = deger;
            this.eSay++;
        }
    }

    public int kuyruktanCikar(){
        if(this.bosmu()){
            return -1;  //kuyrukta eleman yok(değerlerin pozitif tamsayı olacağı varsayımı yapıldı)
        }
        int veri = this.kuyruk[this.bas];
        this.bas++;
        this.eSay--;
        if(this.bas == this.boyut){
            this.bas = 0;
        }
        return veri;
    }
}
