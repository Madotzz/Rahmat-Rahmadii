package day1_ngoding;

import java.util.HashMap;

public class Day57_HashMap {
    public static void main(String[] args) {
//      HashMap adalah struktur data yang berisi sekumpulan nilai (value) dan kunci (key)
        
        HashMap <String, Integer> namaAngkatan = new HashMap <>();
//      disini kita mendeklarasikan variabel namaAngkatan ke dalam HashMap

        namaAngkatan.put("Taufik", 2023);
        namaAngkatan.put("Adzan", 2022);
        namaAngkatan.put("Rahmat", 2023);
        namaAngkatan.put("Pahril", 2021);
        namaAngkatan.put("Aril", 2023);
        namaAngkatan.put("Aco", 2023);
//      kemudian disini kita menambahkan key dan value (nama,angkatan) ke dalam HashMap
 
        System.out.println("Daftar Nama Dan Angkatan : ");
        for (String nama : namaAngkatan.keySet()){
            int angkatan = namaAngkatan.get(nama);
            System.out.println(nama + ", angkatan " + angkatan);
        }
//      dan disini kita menamplkan semua data yang ada di dalam HashMap
      
    }
}
