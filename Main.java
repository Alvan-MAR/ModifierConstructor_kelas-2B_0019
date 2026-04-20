import Base.Elektronik;
import Base.Makanan;
import Base.Minuman;
import Base.Produk;

public class Main {
    public static void main(String[] args) {
        Produk produk = new Produk("Mie Sedap", 3500, 100);
        
        System.out.println(produk.getNama());
        System.out.println(produk.getHarga());
        System.out.println(produk.getStok());
        produk.setHarga(5000);
        produk.setStok(99);
        System.out.println(produk.getNama());
        System.out.println(produk.getHarga());
        System.out.println(produk.getStok());

        Elektronik elektronik = new Elektronik("Mesin Cuci", 10000000, 5, 1);

        elektronik.setGaransi(12);
        elektronik.tampilkanData();

        Makanan makanan = new Makanan("Aldi's Burger", 5000, 100, 1);
        makanan.setExpired(2);
        makanan.tampilkanData();

        Minuman minuman = new Minuman("Iced Matcha", 12000, 50, 1);
        minuman.setExpired(2);
        minuman.tampilkanData();


    }
    
}
