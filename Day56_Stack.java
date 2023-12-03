package day1_ngoding;

import java.util.Stack;

public class Day56_Stack {
    public static void main(String[] args) {
        /*
        Stack adalah struktur data ysng mengimplementasikan tumpukan terakhir
        masuk, keluar pertama
        */
        Stack <String> namaKawan = new Stack<>();
//      disini kita akan mendeklarasikan variabel namaKawan ke dalam Stack
      
        namaKawan.push("Taufik");
        namaKawan.push("Abid");
        namaKawan.push("Udin");
        namaKawan.push("Aco");
        namaKawan.push("Aril");
        namaKawan.push("Gedry");
        namaKawan.push("Kholil");
        namaKawan.push("Rizkhy");
        System.out.println("Nama Kawan : " + namaKawan);
//      kemudian disini kita menampilkan namaKawan menggunakan push
//      push digunakan untuk menambahkan data ke dalam Stack
       
        String hps = namaKawan.pop();
        System.out.println("Nama Kawan yang akan di hapus / POP : " + hps);
//      disini pop digunakan untuk menghapus/mengamabil elemen
   
        System.out.println("Nama-nama Kawan setelah dihapus : " + namaKawan);
//      menampilkan isi Stack setelah dihapus
 
        hps = namaKawan.peek();
        System.out.println("Nama Kawan teratas / peek : " + hps);
//      disini peek digunakan untuk melihat elemen teratas di dalam Stack
        
        System.out.println("Nama-nama Kawan setelah elemen teratas ditampilkan : " + namaKawan);
//      menampilkan isi Stack setelah elemen teratas ditampilkan
      
        namaKawan.push("Rian");
        namaKawan.push("Fadhlur");
        namaKawan.push("Simran");
        namaKawan.push("Fadel");
        System.out.println("Nama-nama Kawan setelah ditambahkan : " + namaKawan);
//      menampilkan nama Kawan setelah menambahkan elemen
    }
}
