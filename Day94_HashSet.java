package day1_ngoding;

import java.util.*;

public class Day94_HashSet {
    public static void main(String[] args) {
        // Membuat program HashSet untuk menyimpan data
        HashSet<String> nama = new HashSet<>();

        // Menambah elemen 
        nama.add("Rahmat");
        nama.add("Taufik");
        nama.add("Udin");
        nama.add("Gedry");
        System.out.println("Daftar nama : " + nama);

        // Menghapus elemen 
        nama.remove(1);
        
        System.out.println("Daftar nama setelah mengapus elemen tertentu : " + nama);
        
        System.out.println("Jumlah elemen dalam HashSet: " + nama.size());

        // Memeriksa apakah daftar nama kosong
        System.out.println("Apakah Daftar nama kosong? " + nama.isEmpty());
    }
}
