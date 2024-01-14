package day1_ngoding;
import java.util.*;
public class Day98_HashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet <Integer> angka = new HashSet<>();
        boolean a = true;
        while (a) {
            System.out.print("Masukkan batas : ");
            int batas = input.nextInt();
            for (int i = 0; i < batas; i++) {
                System.out.print("Masukkan angka : ");
                int b = input.nextInt();
                angka.add(b);
            }
            System.out.println(angka);
            System.out.println("Apakah anda ingin membersihkan HashSet? iya/tidak");
            String hps = input.next();
            if (hps.equalsIgnoreCase("iya")) {
                angka.clear();
                System.out.println(angka);
                System.out.println("Ingin mengisi lagi? iya/tidak");
                String isi = input.next();
                if (isi.equalsIgnoreCase("iya")) {
                    continue;
                } else {
                    a = false;
                }
            } else {
                System.out.println("=====PERNYATAAN=====");
                System.out.println("1. Apakah HashSet kosong?");
                System.out.println("2. Berapa ukuran/size dari HashSet?");
                System.out.println("3. Berapa Rerata HashSet?");
                System.out.println("====================");
                System.out.print("Masukkann pilihan : ");
                int c = input.nextInt();                
                switch (c) {
                    case 1:
                        System.out.println("Apakah HashSet kosong? " + angka.isEmpty());
                        break;
                    case 2:
                        System.out.println("Ukuran dari Hashset adalah : " + angka.size());
                        break;
                    case 3:
                        int rerata = angka.hashCode();
                        rerata /= angka.size();
                        System.out.println("Rerata nya adalah : " + rerata);
                        break;
                    default:
                        System.out.println("Tidak ada dalam pernyataan");
                }
            }
            System.out.println("Apakah anda ingin mengulang? iya/tidak");
            String ulang = input.next();
            if (ulang.equalsIgnoreCase("iya")) {
                angka.clear();
            } else {
                a = false;
            }
            
        }
        
    }
}
