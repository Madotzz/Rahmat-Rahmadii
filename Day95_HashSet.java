package day1_ngoding;
import java.util.*;
public class Day95_HashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet <Integer> angka = new HashSet<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();
        
        int a;
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan angka : ");
            a = input.nextInt();
            angka.add(a);
        }
        System.out.println("Deret angka : " + angka);
        
        angka.remove(22);
        System.out.println("Deret angka setelah menghapus objek tertentu : " + angka);
        
        System.out.println("Apakah Deret angka kosong ? " + angka.isEmpty());
        
        System.out.println("Jumlah elemen yang ada dalam HashSet setelah menghapus objek tertentu : " + angka.size());
        
    }
}
