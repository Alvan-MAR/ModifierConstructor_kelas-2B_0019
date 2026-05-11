package Base;

public abstract class Produk {
    private String nama = "Produk A";
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama(){
        return nama;
    }
    
    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public void setHarga(double harga){
        if (harga <0){
            System.out.println("Harga tidak boleh negatif");
        }
        else {
            this.harga = harga;
        }
    }

    public void setStok(int stok){
        if (stok <0){
            System.out.println("Stok tidak boleh negatif");
        }
        else {
            this.stok = stok;
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > stok){
            System.out.println("Melebihi stok");
        }
        else{
            stok = stok - jumlah;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.printf("Harga: Rp.%.0f,00%n", harga);
        System.out.println("Stok: " + stok);
    }

        public double hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }

    public void beli(int jumlahBeli){
        if (jumlahBeli <= 0){
            System.out.println("Jumlah beli harus lebih dari 0!");
            return;
        }
        if (jumlahBeli > stok){
            System.out.println("Stock" + nama + "Tidak cuku! Tersisa: " + stok);
            return;
        }
        stok -= jumlahBeli;
    }

    public abstract double hitungPajak(int jumlahBeli);
    public abstract double hitungDiskon(int jumlahBeli);
}
