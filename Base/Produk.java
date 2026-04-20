package Base;

public class Produk {
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

    // public void tampilkanInfo() {
    //     System.out.println("Nama Produk: " + nama);
    //     System.out.println("Harga: " + harga);
    //     System.out.println("Stok: " + stok);
    //     System.out.println("-------------------------");
    // }
}
