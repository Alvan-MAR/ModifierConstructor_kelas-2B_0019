package Toko;

import Base.Produk;

public class Kasir {
    private String namaKasir;

    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    // Method dengan parameter berupa parent class
    public void prosesTransaksi(Produk produk, int jumlah) {
        System.out.println("=== Transaksi oleh Kasir: " + namaKasir + " ===");

        produk.tampilkanInfo(); 
        produk.beli(jumlah);
        
        
        double total = produk.hitungTotalHarga(jumlah);
        System.out.println("Jumlah yang dibeli: " + jumlah);
        System.out.printf("Total Biaya: Rp.%.0f,00%n", total);
        System.out.println("Sisa Stok: " + produk.getStok());
        System.out.println("========================================\n");
    }
}