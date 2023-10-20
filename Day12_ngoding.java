package day1_ngoding;
import java.util.Scanner;
//  Perulangan ada 2 jenis, yaitu Perulangan 'for' dan 'while'
//  Perulangan 'for' digunakan untuk mengetahui berapa kali kode diulangi
//  Perulangan 'do-while' digunakan untuk menjalankan kode selama kondisi tertentu benar
public class Day12_ngoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Berikut adalah contoh perulangan 'for'
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        for (int i = 0; i < angka; i++) {
            System.out.println("Miaw");
//          Yang dicetak di dalam string ini akan tercetak sebanyak angka yang akan diinputkan
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
//      Berikut adalah contoh perulangan 'do-while' 
        int angka2;
        do {
            System.out.print("Masukkan angka negatif : ");
            angka2 = input.nextInt();
        } while (angka2 >= 0);        
        
        System.out.println("Kamu sudah memasukkan angka negatif");
        
        
    }
}
