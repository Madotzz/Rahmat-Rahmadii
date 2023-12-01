package day1_ngoding;

import java.util.Enumeration;
import java.util.Vector;

public class Day54_Enumeration {
    public static void main(String[] args) {
//      Membuat list nama teman menggunakan enum dan vector
        Enumeration kawan;
        Vector namaKawan = new Vector();
//      pertama-tama kita akan mendeklarasikan variabel kawan dan namaKawan
        
        namaKawan.add("Aril");
        namaKawan.add("Abid");
        namaKawan.add("Taufik");
        namaKawan.add("Aco");
        namaKawan.add("Udin");
        namaKawan.add("Rian");
        namaKawan.add("Gedry");
        namaKawan.add("Kholil");
        kawan = namaKawan.elements();
//      Kemudian kita menambahkan elemen
        
        System.out.println("Daftar Nama Kawan :");
        while (kawan.hasMoreElements()){
            System.out.println(kawan.nextElement());
        }
        /*
        Fungsi dari hasMoreElements() ialah dia mengembalikan nilai true 
        dan ketika semua elemen terbaca maka dia akan false.
        Kemudian untuk nextElement() dia mengembalikan objek
        Dan disini kita menggunakan while untuk menampilkan semua elemen yang ada
        */        
    }
}
