package day1_ngoding;

import java.util.Scanner;
//  Operasi ternary merupakan cara untuk membuat keputusan yang lebih singkat
//  daripada menggunakan percabangan 'if-else if-else'
public class Day8_ngoding {
    public static void main(String[] args) {
//  Berikut adalah cara menentukan bilangan menggunakan operasi ternary serta
//  menggunakan inputan/Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int bilangan = input.nextInt();
        String hasil = (bilangan >= 0) ? "Bilangan Positif" : "Bilangan Negatif";
        System.out.print(hasil);
        
        
        System.out.println();
    }
}
