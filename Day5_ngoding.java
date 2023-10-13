package day1_ngoding;

import java.util.Scanner;
//  Berikut adalah cara operasi aritmatika menggunakan Scanner/inputan
public class Day5_ngoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = input.nextInt();
//      Codingan di atas untuk mengisi inputan angka pertama dan angka kedua
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a * b;
//      Codingan di atas untuk menjalankan operasi aritmatika
        System.out.println("Hasil Penjumlahan : " + c);
        System.out.println("Hasil Pengurangan : " + d);
        System.out.println("Hasil Pembagian : " + e);
        System.out.println("Hasil Perkalian : " + f);        
//      Codingan di atas untuk menampilkan hasilnya 
    }
}
