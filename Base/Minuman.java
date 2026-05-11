package Base;

public class Minuman extends Produk{
    private int expiredDate;
    private String kategori;
    private static final double PPN = 0.11;
    public Minuman(String nama, double harga, int stok, int expiredDate, String katergori){
        super(nama, harga, stok);
        this.expiredDate = expiredDate;
        this.kategori = katergori;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Masa Expired: " + expiredDate + " Hari");
        System.out.println("Kategori: " + kategori);
        System.out.println("-------------------------");
    }

    public int getExpiredDate(){
        return expiredDate;
    }

    public String getKategori(){
        return kategori;
    }

    public void setExpired(int expiredDate){
        if (expiredDate < 0){
            System.out.println("Masa Expired Tidak Boleh Negatif");
        }
        else{
            this.expiredDate = expiredDate;
        }
    }

    public void setMerek(String kategori){
        this.kategori = kategori;
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
