package com.mirzayogy.pertemuan05.a;

public class Mobil {
    String nama;
    String warna;
    int tahunProduksi;
    
    void info(){
        System.out.println("Warna mobil " + nama + ": " + warna);
    }
    
    String getNama(){
        return nama;
    }
    
    void setNama(){
        
    }

    public Mobil() {
        System.out.println("Ini konstruktor sedang berjalan");
    }

    public Mobil(String nama, String warna, int tahunProduksi) {
        this.nama = nama;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    
    
    
    
}
