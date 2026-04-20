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


    }
    
}
