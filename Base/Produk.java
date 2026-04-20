package Base;

public class Produk {
    private String nama = "Produk A";
    String kategori;
    protected double harga;
    public int stok;

    public Produk(String nama, String kategori, double harga, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("-------------------------");
    }
}
