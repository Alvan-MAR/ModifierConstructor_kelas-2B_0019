package Base;

public class Makanan extends Produk{
    private int expired;
    public Makanan(String nama, double harga, int stok, int expired){
        super(nama, harga, stok);
        this.expired = expired;
    }

    public void tampilkanData(){
        super.tampilkanInfo();
        System.out.println("Masa Expired: " + expired + " Hari");
    }

    public void setExpired(int expired){
        if (expired < 0){
            System.out.println("Masa Expired Tidak Boleh Negatif");
        }
        else{
            this.expired = expired;
        }
    }
}
