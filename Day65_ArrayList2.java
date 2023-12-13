package day1_ngoding;

import java.util.ArrayList;

public class Day65_ArrayList {

    public static void main(String[] args) {
//      membuat program ArrayList mata kuliah
        ArrayList<String> matkul = new ArrayList<>();

//      disini kita akan menambahkan elemen matkul ke dalam ArrayList
        matkul.add("Matematika Dasar");
        matkul.add("Fisika Elektronika");
        matkul.add("Dasar-Dasar Pemrograman");
        matkul.add("Pendidikan Agama Islam");
        matkul.add("Bahasa Indonesia");
        matkul.add("Pengantar Sistem dan Teknologi Informasi");
        matkul.add("Pendidikan Kewarganegaraan");
        matkul.add("Pendidikan Pancasila");
        

//      disini kita akan mencetak nomor untuk setiap elemen matkul menggunakan perulangan
        System.out.println("Daftar Mata Kuliah : ");
        for (int i = 0; i < matkul.size(); i++) {
            System.out.println((i + 1) + ". " + matkul.get(i));
        }

//      kemudian kita akan menghapus elemen "Dasar-Dasar Pemrograman" 
        matkul.remove(2);

//      disini kita mencetak ArrayList setelah menghapus index ke-3(Dasar-Dasar Pemrograman)
        System.out.println("Daftar Mata Kuliah setelah menghapus indeks ke-3 :");
        for (int i = 0; i < matkul.size(); i++) {
            System.out.println((i + 1) + ". " + matkul.get(i));
        }

//      lalu disini kita akan menambahkan kembali elemen Dasar-Dasar Pemrograman ke dalam ArryayList
        matkul.add(2, "Dasar-Dasar Pemrograman");
        
//      dan disini kita akan mencetak matkul setelah menambahkan elemen baru
        System.out.println("Daftar Mata Kuliah setelah menambah elemen baru ");
        for (int i = 0; i < matkul.size(); i++) {
            System.out.println((i + 1) + ". " + matkul.get(i));
        }
    }
}