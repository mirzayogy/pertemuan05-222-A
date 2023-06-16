package com.mirzayogy.pertemuan05.a;
public class Main2 {
    public static void main(String[] args) {
       MobilF1 m = new MobilF1();
       m.warna = "Merah";
       m.nama = "Schumacher";
       m.tahunProduksi = 1990;
       m.panjangSayap = 12.5;
       m.info();
       
       Mobil ms = new Mobil();
       ms.tahunProduksi = 1990;
//       ms.panjangSayap = 10.5;
        ms.info();
    }
}
