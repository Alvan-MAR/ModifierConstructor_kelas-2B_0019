import Base.Produk;

public class Main {
    public static void main(String[] args) {
        Produk produk = new Produk("Mie Sedap", "Makanan", 3500, 100);
        
        System.out.println(produk.stok);
        //System.out.println(produk.nama);
        //System.out.println(produk.harga);
        //System.out.println(produk.kategori);

        produk.tampilkanInfo();
    }
    
}
