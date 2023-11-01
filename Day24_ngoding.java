package day1_ngoding;

import java.util.Scanner;

public class Day24_ngoding {
    public static void main(String[] args) {
//      Menentukan bilangan ganjil genap menggunakan operator ternary
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int bilangan = input.nextInt();
        String hasil = (bilangan % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.print(hasil);
        
        System.out.println();
    }
    
}
