package Base;

public class Elektronik extends Produk{
    private int masaGaransi;
    public Elektronik(String nama, double harga, int stok, int masaGaransi){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }

    public void tampilkanData(){
        super.tampilkanInfo();
        System.out.println("Masa Garansi: " + masaGaransi + " Tahun");
    }

    public void setGaransi(int masaGaransi){
        if (masaGaransi < 0){
            System.out.println("Masa Garansi Tidak Boleh Negatif");
        }
        else{
            this.masaGaransi = masaGaransi;
        }
    }
}
