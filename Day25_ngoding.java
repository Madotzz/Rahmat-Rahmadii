package day1_ngoding;

import java.util.Scanner;

public class Day25_ngoding {
    public static void main(String[] args) {
//      Masih dengan menentukan bilangan ganjil / genap, kali ini kita akan menggunakan operator Switch Case
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        switch(angka){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println(angka + " adalah bilangan ganjil");
            break;
            default:
                System.out.println(angka + " adalah bilangan genap");
        }
    }
}
