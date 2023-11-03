package day1_ngoding;

import java.util.Scanner;

public class Day26_ngoding {
    public static void main(String[] args) {
//      Menentukan predikat nilai menggunakan Operator Ternary
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        String predikat = 
                nilai >= 90 ? "Predikat nilai yang kamu dapat adalah A" :
                nilai >= 70 ? "Predikat nilai yang kamu dapat adalah B" :
                nilai >= 50 ? "Predikat nilai yang kamu dapat adalah C" :
                "Kamu dapat nilai Error";
        System.out.println(predikat);
    }
}
