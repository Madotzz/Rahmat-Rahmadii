package day1_ngoding;
public class Day3_ngoding {
//  Berikut adalah cara mengkonversi String ke tipe data primitif
//  Dan mengkonversi Tipe data primitif ke String
    public static void main(String[] args) {
        String tgl = "22";
        int tgllahir = Integer.parseInt(tgl);
//  Codingan di atas untuk mengkonversi String ke Integer
        System.out.println("Tanggal Lahir : " + tgllahir);
//  Ini untuk menampilkan codingan yang mengkonversi String ke Integer
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        int bln = 5;
        String blnlahir = Integer.toString(bln);
//  Codingan di atas untuk mengkonversi Integer ke String
        System.out.println("Bulan Lahir : " + blnlahir);
//  Ini untuk menampilkan codingan yang mengkonversi Integer ke String
        
    }
}
