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
        System.out.println("-------------------------");
        produk.setHarga(5000);
        produk.setStok(99);
        System.out.println(produk.getNama());
        System.out.println(produk.getHarga());
        System.out.println(produk.getStok());
        System.out.println("-------------------------");

        Elektronik elektronik = new Elektronik("Mesin Cuci", 10000000, 5, 1, "Polytron");
        elektronik.setGaransi(12);
        elektronik.tampilkanData();

        Makanan makanan = new Makanan("Aldi's Burger", 5000, 100, 1,"Main Course");
        makanan.setExpired(2);
        makanan.tampilkanData();

        Minuman minuman = new Minuman("Iced Matcha", 12000, 50, 1,"Tea");
        minuman.setExpired(2);
        minuman.tampilkanData();

        //overloading hitungPajak() Elektronik
        System.out.println("======Rincian Pajak Elektronik=====");

        //versi 1 - pajak standar
        int jumlahBeli = 1;
        double pajakElektronik = elektronik.hitungPajak(jumlahBeli);
        double totalElektronik = elektronik.hitungHargaSetelahPajak(jumlahBeli);
        System.out.println(elektronik.getNama() + " x" + jumlahBeli + " PPN Standar 11%");
        System.out.printf("Subtotal: Rp.%.0f,00%n", elektronik.hitungTotalHarga(jumlahBeli));
        System.out.printf("Pajak: Rp.%.0f,00%n", elektronik.hitungPajak(jumlahBeli));
        System.out.printf("Total: Rp.%.0f,00%n", elektronik.hitungHargaSetelahPajak(jumlahBeli));
        System.out.println("-------------------------");      

        //versi 2 - pajak custom
        jumlahBeli = 5;
        pajakElektronik = elektronik.hitungPajak(jumlahBeli, 5);
        totalElektronik = elektronik.hitungHargaSetelahPajak(jumlahBeli);
        System.out.println(elektronik.getNama() + " x" + jumlahBeli + " PPN Custom 5%");
        System.out.printf("Subtotal: Rp.%.0f,00%n", elektronik.hitungTotalHarga(jumlahBeli));
        System.out.printf("Pajak: Rp.%.0f,00%n", elektronik.hitungPajak(jumlahBeli, 5));
        System.out.printf("Total: Rp.%.0f,00%n", elektronik.hitungHargaSetelahPajak(jumlahBeli));
        System.out.println("-------------------------");

        //Overloading hitungDiskon() Makanan
        System.out.println("======Rincian Diskon Makanan=====");

        //versi 1 - diskon standar
        jumlahBeli = 10;
        double diskonMakanan = makanan.hitungDiskon(jumlahBeli);
        double totalMakanan = makanan.hitungHargaSetelahDiskon(jumlahBeli);
        System.out.println(makanan.getNama() + " x" + jumlahBeli + " Diskon Standar 5%");
        System.out.printf("Subtotal: Rp.%.0f,00%n", makanan.hitungTotalHarga(jumlahBeli));
        System.out.printf("Diskon: Rp.%.0f,00%n", makanan.hitungDiskon(jumlahBeli));
        System.out.printf("Total: Rp.%.0f,00%n", makanan.hitungHargaSetelahDiskon(jumlahBeli));
        System.out.println("-------------------------");

        //versi 2 - diskon custom
        jumlahBeli = 4;
        diskonMakanan = makanan.hitungDiskon(jumlahBeli,20);
        totalMakanan = makanan.hitungHargaSetelahDiskon(jumlahBeli,20);
        System.out.println(makanan.getNama() + " x" + jumlahBeli + " PPN Custom 20%");
        System.out.printf("Subtotal: Rp.%.0f,00%n", makanan.hitungTotalHarga(jumlahBeli));
        System.out.printf("Diskon: Rp.%.0f,00%n", makanan.hitungDiskon(jumlahBeli, 20));
        System.out.printf("Total: Rp.%.0f,00%n", makanan.hitungHargaSetelahDiskon(jumlahBeli,20));
        System.out.println("-------------------------");

        //Overloading hitungDiskon() Minuman
        System.out.println("======Rincian Pajak & Diskon Minuman=====");

        //versi 1 - pajak dan diskon standar
        jumlahBeli = 3;
        double pajakMinuman = minuman.hitungPajak(jumlahBeli);
        double diskonMinuman = minuman.hitungDiskon(jumlahBeli);
        double totalMinuman = minuman.hitungHargaSetelahPajak(jumlahBeli);
        System.out.println(minuman.getNama() + " x" + jumlahBeli + " PPN Standar 11% & Diskon Standar 5%");
        System.out.printf("Subtotal: Rp.%.0f,00%n", minuman.hitungTotalHarga(jumlahBeli));
        System.out.printf("Pajak: Rp.%.0f,00%n", minuman.hitungPajak(jumlahBeli));
        System.out.printf("Diskon: Rp.%.0f,00%n", minuman.hitungDiskon(jumlahBeli));
        System.out.printf("Total: Rp.%.0f,00%n", minuman.hitungTotalSemua(jumlahBeli));
        System.out.println("-------------------------");

        //versi 2 - pajak dan diskon custom
        jumlahBeli = 12;
        pajakMinuman = minuman.hitungPajak(jumlahBeli,7);
        diskonMinuman = minuman.hitungDiskon(jumlahBeli,15);
        totalMinuman = minuman.hitungTotalSemua(jumlahBeli, 15, 7);
        System.out.println(minuman.getNama() + " x" + jumlahBeli + " PPN Custom 7% & Diskon Custom 15%");
        System.out.printf("Subtotal: Rp.%.0f,00%n", minuman.hitungTotalHarga(jumlahBeli));
        System.out.printf("Pajak: Rp.%.0f,00%n", minuman.hitungPajak(jumlahBeli,7));
        System.out.printf("Diskon: Rp.%.0f,00%n", minuman.hitungPajak(jumlahBeli,15));
        System.out.printf("Total: Rp.%.0f,00%n", minuman.hitungTotalSemua(jumlahBeli,15,7));
        System.out.println("-------------------------");
    }
    
}
