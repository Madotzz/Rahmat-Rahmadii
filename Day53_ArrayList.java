package day1_ngoding;

import java.util.ArrayList;

public class Day53_ArrayList {
    public static void main(String[] args) {
//      Membuat method namaHewan di dalam ArrayList
        ArrayList<String> namaHewan = new ArrayList<>();
        
//      Menambahkan elemen ke ArrayList
        namaHewan.add("Kucing");
        namaHewan.add("Anjing");
        namaHewan.add("Tikus");
        namaHewan.add("Sapi");
        namaHewan.add("Jerapah");
        
        System.out.println("~~~~~Daftar nama Hewan~~~~~");
//      Menampilkan semua elemen menggunakan perulangan
        for (int i = 0; i < namaHewan.size(); i++) {
            System.out.println((i + 1) + ". " + namaHewan.get(i));
        }
        
        
    }
}
