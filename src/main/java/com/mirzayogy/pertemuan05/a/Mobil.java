package com.mirzayogy.pertemuan05.a;

public class Mobil {
    String nama;
    String warna;
    int tahunProduksi;
    
    void info(){
        System.out.println("Warna mobil " + nama + ": " + warna);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunProduksi() {
        System.out.println("");
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
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
