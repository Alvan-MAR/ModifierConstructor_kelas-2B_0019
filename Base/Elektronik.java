package Base;

public class Elektronik extends Produk{
    private int masaGaransi;
    private String merek;
    private static final double PPN = 0.11;
    public Elektronik(String nama, double harga, int stok, int masaGaransi, String merek){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
        this.merek = merek;
    }

        @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Masa Garansi: " + masaGaransi + " Tahun");
        System.out.println("Merek: " + merek);
        System.out.println("-------------------------");

    }

    public int getMasaGaransi(){
        return masaGaransi;
    }

    public String getMerek(){
        return merek;
    }

    public void setGaransi(int masaGaransi){
        if (masaGaransi < 0){
            System.out.println("Masa Garansi Tidak Boleh Negatif");
        }
        else{
            this.masaGaransi = masaGaransi;
        }
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    //versi 1 - pajak PPN tetap
    @Override
    public double hitungPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    //versi 2 - pajak custom
    public double hitungPajak(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli) * (persenPajak/100);
    }

    public double hitungHargaSetelahPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }

    public double hitungHargaSetelahPajak(int jumlahBeli,double persenPajak){
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli,persenPajak);
    }

    //overloading
    //versi 1 - diskon otomatis jika beli >= 10
    @Override
    public double hitungDiskon(int jumlahBeli){
        if (jumlahBeli >= 10){
            return hitungTotalHarga(jumlahBeli) * 0.05;
        }
        return 0;
    }

    //versi 2 - diskon dengan persentase custom
    public double hitungDiskon(int jumlahBeli, double persenDiskon){
        return hitungTotalHarga(jumlahBeli) * (persenDiskon/100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli, double persenDiskon){
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli,persenDiskon);
    }

    public double hitungTotalSemua(int jumlahBeli) {
        return hitungHargaSetelahPajak(jumlahBeli) - hitungDiskon(jumlahBeli);
    }

    public double hitungTotalSemua(int jumlahBeli, double persenPajak, double persenDiskon) {
        return hitungHargaSetelahPajak(jumlahBeli,persenPajak) - hitungDiskon(jumlahBeli,persenDiskon);
    }


}
