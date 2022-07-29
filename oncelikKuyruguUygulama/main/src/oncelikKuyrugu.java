public class oncelikKuyrugu {
    
    public oncelikKuyrukDugum on;
    public oncelikKuyrukDugum arka;

    public oncelikKuyrugu(){
        this.on = null;
        this.arka = null;
    }

    public boolean bosmu(){
        if(this.on == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void ekle(int v,int o){
        oncelikKuyrukDugum yeni = new oncelikKuyrukDugum(v,o);
        if(this.bosmu()){   //kuyruk boş ise
            this.on = this.arka =  yeni;
            return;
        }

        //basa ekle --> yeni gelenin önceliği kuyruk önündekinden küçük ise (1 , 2 den öncelikli şekildedir)
        if(yeni.oncelik < this.on.oncelik){
            yeni.sonraki = this.on;
            this.on = yeni;
            return;
        }

        //sona ekle --> yeni gelenin önceliği kuyruk arkasındakinden büyük ya da eşit ise
        if(yeni.oncelik >= this.arka.oncelik){
            this.arka.sonraki = yeni;
            this.arka = yeni;
            return;
        }

        //araya ekle --> aynı önceliğe sahip düğümlerin en sonuna ekleme
        oncelikKuyrukDugum temp = this.on;

        while(yeni.oncelik >= temp.sonraki.oncelik){
            temp = temp.sonraki;
        }

        yeni.sonraki = temp.sonraki;
        temp.sonraki = yeni;
    }

    public int cikart() { 
        if(this.bosmu()){
            return -1;
        }
        int veri=this.on.veri;
        if(this.on.sonraki==null){  //kuyrukta tek değer varsa arka null yapılır
            this.arka=null;
        }
        this.on=this.on.sonraki;    //listedeki ilk düğüm silinir,tek düğüm varsa on null olacaktır
        return veri;
    }

    public void listele(){
        oncelikKuyrukDugum temp = this.on;
        while(temp != null){
            temp.yazdir();
            temp = temp.sonraki;
        }
    }

}
