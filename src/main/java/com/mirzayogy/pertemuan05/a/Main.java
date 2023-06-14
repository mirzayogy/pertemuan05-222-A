package com.mirzayogy.pertemuan05.a;

public class Main {
    public static void main(String[] args) {
        
        Mobil mobil = new Mobil();
        mobil.warna = "Hijau Sage";
        mobil.tahunProduksi = 2023;
        
        Mobil mobilku = new Mobil();
        mobilku.warna = "Hijau Miskin";
        mobilku.tahunProduksi = 2022;
        
        Mobil mobilmu = new Mobil();
        mobilmu.warna = "Biru Dongker";
        mobilmu.tahunProduksi = 2010;
        
        Mobil mobilnya = new Mobil("Kodok", "Hijau", 2023);
        
        mobil.info();
        mobilmu.info();
        mobilku.info();
        mobilnya.info();

    }
}
